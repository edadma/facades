import scala.scalajs.js
import js.annotation._
import js.|

package xyz.hyperreal.facades.sockjs {

  import io.scalajs.nodejs
  import xyz.hyperreal.facades.nodejs.NodeJS.ReadWriteStream

  @js.native
  trait ServerOptions extends js.Object {
    var sockjs_url: js.UndefOr[String] = js.native
    var prefix: js.UndefOr[String] = js.native
    var response_limit: js.UndefOr[Double] = js.native
    var websocket: js.UndefOr[Boolean] = js.native
    var jsessionid: js.UndefOr[js.Any] = js.native
    def log(severity: String, message: String): Unit = js.native
    var heartbeat_delay: js.UndefOr[Double] = js.native
    var disconnect_delay: js.UndefOr[Double] = js.native
  }

  @js.native
  trait Server extends nodejs.events.EventEmitter {
    def installHandlers(server: nodejs.http.Server, options: ServerOptions = ???): js.Dynamic = js.native
    def on(event: String, listener: js.Function1[Connection, Any]): this.type = js.native
    override def on(event: String, listener: js.Function): this.type = js.native
  }

  @js.native
  trait Connection extends ReadWriteStream {
    var remoteAddress: String = js.native
    var remotePort: Double = js.native
    var address: Connection.Address = js.native
    var headers: Connection.Headers = js.native
    var url: String = js.native
    var pathname: String = js.native
    var prefix: String = js.native
    var protocol: String = js.native
    var readyState: Double = js.native
    var id: String = js.native
    def close(code: String, reason: String): Boolean = js.native
    def destroy(): Unit = js.native
    def on(event: String, listener: js.Function1[String, Any]): this.type = js.native
    def on(event: String, listener: js.Function0[Unit]): this.type = js.native
    override def on(event: String, listener: js.Function): this.type = js.native
  }

  object Connection {

    @js.native
    trait Address extends js.Object {
      @JSBracketAccess
      def apply(key: String): js.Any = js.native
      @JSBracketAccess
      def update(key: String, v: js.Any): Unit = js.native
    }

    @js.native
    trait Headers extends js.Object {
      @JSBracketAccess
      def apply(key: String): String = js.native
      @JSBracketAccess
      def update(key: String, v: String): Unit = js.native
    }
  }

  @js.native
  @JSGlobalScope
  object Sockjs extends js.Object {
    def createServer(options: ServerOptions = ???): Server = js.native
  }

}
