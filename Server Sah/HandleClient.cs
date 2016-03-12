using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net.Sockets;
using System.Threading;

namespace Server_Sah
{
    class HandleClient
    {
        TcpClient clientSocket;
        string clNo;
        public void startClient(TcpClient inClientSocket, string clientNo)
        {
            this.clientSocket = inClientSocket;
            this.clNo = clientNo;
            Thread ctThread = new Thread(doChat);
            ctThread.Start();
        }

        private void doChat()
        {
            int requestCount = 0;
            byte[] bytesFrom = new byte[10025];
            string dataFromClient = nul
        }
    }
}
