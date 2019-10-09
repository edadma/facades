import scala.scalajs.js
import js.annotation._
import js.|

package xyz.hyperreal.facades.connect {

  import io.scalajs.nodejs.http
  import io.scalajs.nodejs.events

  package createServer {

    import xyz.hyperreal.facades.connect.createServer.CreateServer.{HandleFunction, ServerHandle}

    @js.native
    trait ServerStackItem extends js.Object {
      var route: String = js.native
      var handle: ServerHandle = js.native
    }

    @js.native
    trait Server extends events.EventEmitter {
      def apply(req: http.IncomingMessage, res: http.ServerResponse, next: js.Function = ???): Unit = js.native

      var route: String = js.native
      var stack: js.Array[ServerStackItem] = js.native

      def use(fn: HandleFunction): Server = js.native

      def use(route: String, fn: HandleFunction): Server = js.native

      def handle(req: http.IncomingMessage, res: http.ServerResponse, next: js.Function): Unit = js.native

      def listen(port: Double, hostname: String, backlog: Double, callback: js.Function): http.Server = js.native

      def listen(port: Double, hostname: String, callback: js.Function): http.Server = js.native

      def listen(path: String, callback: js.Function): http.Server = js.native

      def listen(handle: js.Any, listeningListener: js.Function): http.Server = js.native
    }

    @js.native
    @JSGlobal("createServer")
    object CreateServer extends js.Object {
      type ServerHandle = HandleFunction | http.Server
      type NextFunction = js.Function1[js.Any, Unit]
      type SimpleHandleFunction = js.Function2[http.IncomingMessage, http.ServerResponse, Unit]
      type NextHandleFunction = js.Function3[http.IncomingMessage, http.ServerResponse, NextFunction, Unit]
      type ErrorHandleFunction = js.Function4[js.Any, http.IncomingMessage, http.ServerResponse, NextFunction, Unit]
      type HandleFunction = SimpleHandleFunction | NextHandleFunction | ErrorHandleFunction
    }

  }

}