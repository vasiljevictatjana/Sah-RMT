using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;
using System.Net.Sockets;

namespace Server_Sah
{
    class Program
    {
        static void Main(string[] args)
        {
            //Creates a listener which is waiting for clients to ask to connect
            TcpListener serverSocket = new TcpListener(30121);

            //Creates a socket for client to grab to
            TcpClient clientSocket = default(TcpClient);

            //List of all clients
            LinkedList<TcpClient> listOfClients = new LinkedList<TcpClient>();


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
                listOfClients.AddFirst(clientSocket);

                HandleClient client = new HandleClient();
                client.startClient(clientSocket, Convert.ToString(counter));
            }

            clientSocket.Close();
            serverSocket.Stop();
            Console.WriteLine(" >> " + "Server shutting down...");
            Console.ReadLine();


        }



    }
}
