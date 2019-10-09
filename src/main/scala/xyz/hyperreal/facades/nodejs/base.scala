import scala.scalajs.js
import js.annotation._
import js.|

package xyz.hyperreal.facades.nodejs {

  package NodeJS {

    import io.scalajs.nodejs.buffer.Buffer
    import io.scalajs.nodejs.events.EventEmitter

    @js.native
    trait ReadableStream extends EventEmitter {
      var readable: Boolean = js.native
      def read(size: Double = ???): String | Buffer = js.native
      def setEncoding(encoding: String): this.type = js.native
      def pause(): this.type = js.native
      def resume(): this.type = js.native
      def isPaused(): Boolean = js.native
      def pipe[T <: WritableStream](destination: T, options: js.Any = ???): T = js.native
      def unpipe[T <: WritableStream](destination: T = ???): this.type = js.native
      def unshift(chunk: String): Unit = js.native
      def unshift(chunk: Buffer): Unit = js.native
      def wrap(oldStream: ReadableStream): this.type = js.native
    }

    @js.native
    trait WritableStream extends EventEmitter {
      var writable: Boolean = js.native
      def write(buffer: Buffer | String, cb: js.Function = ???): Boolean = js.native
      def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
      def end(cb: js.Function = ???): Unit = js.native
      def end(buffer: Buffer, cb: js.Function): Unit = js.native
      def end(str: String, cb: js.Function): Unit = js.native
      def end(str: String, encoding: String, cb: js.Function): Unit = js.native
    }

    @js.native
    trait ReadWriteStream extends ReadableStream with WritableStream {
    }

  }

}
