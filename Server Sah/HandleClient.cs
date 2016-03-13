using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net.Sockets;
using System.Threading;
using System.Collections;

namespace Server_Sah
{
    class HandleClient
    {
        TcpClient clientSocket;
        string clNo;
        Hashtable clientList;

        public void startClient(TcpClient inClientSocket, string clientNo, Hashtable cList)
        {
            this.clientSocket = inClientSocket;
            this.clNo = clientNo;
            this.clientList = cList;
            Thread ctThread = new Thread(doChat);
            ctThread.Start();
        }

        private void doChat()
        {
            int requestCount = 0;
            byte[] bytesFrom = new byte[10025];
            string dataFromClient = null;

            byte[] sendBytes = null;
            string serverResponse = null;
            string rCount = null;
            requestCount = 0;


            while (true)
            {
                try
                {
                    requestCount = requestCount + 1;
                    //It reads data from clients and stores it in a variable
                    NetworkStream networkStream = clientSocket.GetStream();
                    networkStream.Read(bytesFrom, 0, (int)clientSocket.ReceiveBufferSize);
                    //Defines a variable
                    //TODO diferent types of prefixes mean different functions
                    dataFromClient = System.Text.Encoding.ASCII.GetString(bytesFrom);
                    dataFromClient = dataFromClient.Substring(0, dataFromClient.IndexOf("$"));

                    Console.WriteLine(" >> " + "From client-" + clNo + dataFromClient);

                    //creates a response and send it back
                    rCount = Convert.ToString(requestCount);

                    Program.broadcast(dataFromClient, clNo, true);

                    /*
                    serverResponse = "Server to clinet(" + clNo + ") " + rCount;
                    sendBytes = Encoding.ASCII.GetBytes(serverResponse);
                    networkStream.Write(sendBytes, 0, sendBytes.Length);
                    networkStream.Flush();
                    Console.WriteLine(" >> " + serverResponse);*/

                }
                catch (Exception ex)
                {

                    Console.WriteLine(" >> " + ex.ToString());
                }
            }
        }
    }
}
