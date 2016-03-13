using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;
using System.Net.Sockets;
using System.Collections;

namespace Server_Sah
{
    class Program
    {
        public static Hashtable clientList = new Hashtable();

        static void Main(string[] args)
        {
            //Creates a listener which is waiting for clients to ask to connect
            TcpListener serverSocket = new TcpListener(9001);

            //Creates a socket for client to grab to
            TcpClient clientSocket = default(TcpClient);

            //List of all clients
            


            // TODO maybe this need to be a static variable due to further ussage in to all chat function as an counter of connected clients
            int counter;

            //Starts the socket and now is ready to accept clients
            serverSocket.Start();
            Console.WriteLine(" >> " + "Server Running");

            counter = 0;
            while (true)
            {
                counter++;
                clientSocket = serverSocket.AcceptTcpClient();
                Console.WriteLine(" >> " + "Client No: " + Convert.ToSingle(counter) + " connected!");


                //Next 6 lines take data from client
                byte[] bytesFrom = new byte[10025];
                string dataFromClient = null;

                NetworkStream networkStream = clientSocket.GetStream();
                networkStream.Read(bytesFrom, 0, (int)clientSocket.ReceiveBufferSize);
                dataFromClient = System.Text.Encoding.ASCII.GetString(bytesFrom);
                dataFromClient = dataFromClient.Substring(0, dataFromClient.IndexOf("$"));


                clientList.Add(dataFromClient, clientSocket);
                broadcast(dataFromClient + " Joined ", dataFromClient, false);

                Console.WriteLine(dataFromClient + " Joined chat room ");
                HandleClient client = new HandleClient();
                client.startClient(clientSocket, Convert.ToString(counter), clientList);
            }

            clientSocket.Close();
            serverSocket.Stop();
            Console.WriteLine(" >> " + "Server shutting down...");
            Console.ReadLine();


        }//end main

        public static void broadcast(string msg, string uName, bool flag)
        {
            foreach (DictionaryEntry Item in clientList)
            {
                TcpClient broadcastSocket;
                broadcastSocket = (TcpClient)Item.Value;
                NetworkStream broadcastStream = broadcastSocket.GetStream();
                Byte[] broadcastBytes = null;

                if (flag == true)
                {
                    broadcastBytes = Encoding.ASCII.GetBytes(uName + " says : " + msg);
                }
                else
                {
                    broadcastBytes = Encoding.ASCII.GetBytes(msg);
                }

                broadcastStream.Write(broadcastBytes, 0, broadcastBytes.Length);
                broadcastStream.Flush();
            }
        }  //end broadcast function


    }
}
