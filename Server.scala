import java.net._
import java.io._

object Server extends App {
    val server = new ServerSocket(8088)

    while (true) {
        var sockets = server.accept()
       var input = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        var line = ""
        System.out.println("Starting server...")
        while ((line = input.readLine()) != null) {
            System.out.println(line)
        }
    }
}