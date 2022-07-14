# 装饰器模式
## 应用场景
一类类相似，防止继承的类爆炸，结构复杂，使用装饰器模式用组合关系代替继承关系<br>
## 功能
对类功能的增强<br>
装饰类和原始类继承同一个类<br>
装饰类按实际情况看是否需要将公共代码抽离成一个父类<br>
## 优点
装饰类和原始类不耦合，大致符合开闭原则，易扩展
## 缺点
多层装饰，代码复杂，阅读渐渐开始困难