package solid.iskov_substitution;

/**
 * @author zhangtian1
 */
public class Read {

    /*
        子类需要承担原父类的功能，但是不能改变原父类的功能

        * 子类方法的参数类型必须与父类的参数类型相匹配或是更加抽象

        feed(Cat c)
        1. 好的方式：创建一个子类重写了feed方法，使其能够给任何动物喂食 feed(Animal c) 包括 Cat
        2. 不好的方式：创建一个子类重写了feed方法，使其只能给孟加拉猫（猫的子类）喂食 feed(BengalCat c)

        * 子类方法的返回类型必须与父类的返回类型相匹配或是更加具体

        Cat bugCat()
        1. 好的方式：创建一个子类重写了bugCat方法，使其能够返回孟加拉猫 BengalCat bugCat()
        2. 不好的方式：创建一个子类重写了bugCat方法，使其返回 Animal bugCat()
     */

}
