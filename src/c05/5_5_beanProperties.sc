// As you saw in the preceding section,Scala provides getter and setter methods for the fields that you define.
// However,the names of these methods are not what Java tools expect.The JavaBeans specification defines a
// Java property as a pair fo getFoo/setFoo methods.Many Java tools rely on this naming convention.
// When you annotate a Scala field with @BeanProperty,then such methods are automatically generated.For example,
import scala.beans.BeanProperty
class Person{
  @BeanProperty var name:String = _
}
/* generates four methods:
1. name:String
2. name_=(newValue:String):Unit
3. getName():String
4. setName(newValue:String):Unit

NOTE: If you define a field as a primary constructor parameter,and you want JavaBeans getters and setters,
annotate the constructor parameter like this:
class Person(@BeanProperty var name:String)

*/