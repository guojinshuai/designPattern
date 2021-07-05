# designPattern
Java设计模式

https://blog.csdn.net/weixin_41832813/article/details/118492295

面向对象的六大设计原则

一、指导思想
1、可维护性Maintainablity
修改功能，需要改动的地方越少，可维护性越好
2、可复用性Reusability
代码可被重复使用
写出自己总结的类库
3、可扩展性Extensibility/Scalability
添加功能，无需修改原来代码
4、灵活性Flexibility/mobility/adaptability
代码接口可以灵活调用

二、设计原则
1、单一职责原则（Single Responsibility Principle）
一个类，负责单一的职责
高内聚，低耦合
2、开闭原则（Open-close Principle）
对扩展开放，对修改关闭：尽量在不修改原来代码的情况下扩展
抽象化和多态是开闭原则的关键
3、里氏替换原则（Liscov Substitution Principle）
所有使用父类的地方，必须能够透明的使用子类对象
4、依赖倒置原则（Dependency Inversion Principle）
依赖对象，不依赖具体
面向抽象编程
5、接口隔离原则（Interface Segregation Principle）
每一个接口应该承担自己独立的角色，不干不该自己干的事
避免子类实现不需实现的方法
需要对客户提供接口时，暴露最小的接口
6、迪米特原则（Law of Demeter）
尽量不要和陌生人说话
一个对象应该对其他对象有最小的了解
在迪米特法则中，对于一个对象，非陌生人包括以下几类：
当前对象本身(this)
以参数形式传入到当前对象方法中的对象
当前对象的成员对象
成员对象是集合，则集合中的所有元素都是朋友
当前对象所创建的对象

三、总结
1、OCP：总纲，对扩展开放，对修改关闭
2、SRP：类的职责要单一
3、LSP：子类可以透明替换父类
4、DIP：面向接口编程
5、ISP：接口的职责要单一
6、LOD：降低耦合


创建型模式
1、Abstract Factory

2、Builder

3、Factory Method

4、Prototype
继承标记接口Cloneable。
深拷贝和浅拷贝详见：https://blog.csdn.net/weixin_41832813/article/details/118090534

5、Singleton
单例，使用枚举实现单例

结构型模式
1、Adapter

2、Bridge

3、Composite

4、Decorator

5、Facade
【GOF】的书中指出：在门面模式中，通常只需要一个门面类，并且此门面类只有一个实例，换言之它是一个单例类。当然这并不意味着在整个系统里只能有一个门面类，而仅仅是说对每一个子系统只有一个门面类。
个人理解：对外统一暴露的接口。

6、Flyweight
使用享元模式需要维护一个存储享元对象的享元池，而这需要耗费资源，因此，应当在多次重复使用享元对象时才值得使用享元模式

7、Proxy
详见：https://blog.csdn.net/weixin_41832813/article/details/118310499

行为型模式
1、ChainOfResponsibility
详见：https://blog.csdn.net/weixin_41832813/article/details/118182541

2、Command

3、Interpreter
每一条文法规则都可以表示为一个类，因此可以方便地实现一个简单的语言。

4、Iterator

5、Mediator

6、Memento

7、Observer

8、State

9、Strategy
Comparator接口是比较器接口（策略模式）

10、Template Method

11、Visitor

