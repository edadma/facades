import scala.scalajs.js
import js.annotation._
import js.|

package xyz.hyperreal.facades.body_parser {

  import io.scalajs.nodejs.http
  import io.scalajs.nodejs.buffer.Buffer
  import xyz.hyperreal.facades.connect.createServer.CreateServer.NextHandleFunction

  package bodyParser {

    import xyz.hyperreal.facades.connect.createServer.CreateServer.NextHandleFunction

    @js.native
    trait Options extends js.Object {
      var inflate: js.UndefOr[Boolean] = js.native
      var limit: js.UndefOr[Double | String] = js.native
      var `type`: js.UndefOr[String | js.Array[String] | js.Function1[http.IncomingMessage, Any]] = js.native
      def verify(req: http.IncomingMessage, res: http.ServerResponse, buf: Buffer, encoding: String): Unit = js.native
    }

    @js.native
    trait OptionsJson extends Options {
      def reviver(key: String, value: js.Any): js.Dynamic = js.native
      var strict: js.UndefOr[Boolean] = js.native
    }

    @js.native
    trait OptionsText extends Options {
      var defaultCharset: js.UndefOr[String] = js.native
    }

    @js.native
    trait OptionsUrlencoded extends Options {
      var extended: js.UndefOr[Boolean] = js.native
      var parameterLimit: js.UndefOr[Double] = js.native
    }

    @js.native
    @JSGlobal("bodyParser")
    object BodyParser extends js.Object {
      def json(options: OptionsJson = ???): NextHandleFunction = js.native
      def raw(options: Options = ???): NextHandleFunction = js.native
      def text(options: OptionsText = ???): NextHandleFunction = js.native
      def urlencoded(options: OptionsUrlencoded = ???): NextHandleFunction = js.native
    }

  }

  @js.native
  @JSGlobalScope
  object Nodejs extends js.Object {
    def bodyParser(options: xyz.hyperreal.facades.body_parser.bodyParser.OptionsJson with xyz.hyperreal.facades.body_parser.bodyParser.OptionsText with xyz.hyperreal.facades.body_parser.bodyParser.OptionsUrlencoded = ???): NextHandleFunction = js.native
  }

}
