package xyz.hyperreal.facades

import io.scalajs.nodejs.http

import scala.scalajs.js


object Main extends App {

  val port = 3000

  val server = http.Http.createServer((req, res) => {
    res.end(s"Hello from Scala.js! ")//(${req.path})
  })

  server.listen( port, () => println(s"server is listening on $port") )

}