import scala.scalajs.js
import js.annotation._
import js.|

package xyz.hyperreal.facades.`range-parser` {

  package RangeParser {

    @js.native
    trait Ranges extends js.Array[Range] {
      var `type`: String = js.native
    }

    @js.native
    trait Range extends js.Object {
      var start: Double = js.native
      var end: Double = js.native
    }

    @js.native
    trait Options extends js.Object {
      var combine: js.UndefOr[Boolean] = js.native
    }

    @js.native
    @JSGlobal("RangeParser")
    object RangeParser extends js.Object {
      type ResultUnsatisfiable = Int
      type ResultInvalid = Int
      type Result = ResultUnsatisfiable | ResultInvalid
    }

  }

  @js.native
  @JSGlobalScope
  object `Range-parser` extends js.Object {
    def RangeParser(size: Double, str: String, options: xyz.hyperreal.facades.`range-parser`.RangeParser.Options = ???): xyz.hyperreal.facades.`range-parser`.RangeParser.RangeParser.Result | xyz.hyperreal.facades.`range-parser`.RangeParser.Ranges = js.native
  }

}
