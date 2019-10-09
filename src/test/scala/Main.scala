package xyz.hyperreal.facades

import io.scalajs.nodejs.http


object Main extends App {

  val port = 3000

  val server = http.Http.createServer((req, res) => {
    println( req )
    res.end(s"Hello from Scala.js! ")//(${req.path})
  })

  server.listen( port, () => println(s"server is listening on $port") )

}