package concurrentprogramming

/**
 * Created by huang_xw on 2017/2/8.
 * E_mail:huang_xw@ctrip.com
 * web:www.ctrip.com
 * http://www.cnblogs.com/dolphin0520/p/3920373.html
 * Volatile保证了共享变量的可见性即当一个线程对某个共享变量修改后其它线程立即可见,
 * 并且在多线程访问共享变量不会造成线程上下文切换即不会造成cpu内核态和用户态之间的切换,成本要比
 * synchronized小很多，但是并不能代替互斥锁来实现计数器,因为其不能保证操作的原子性。
 * 1、共享变量可见性
 * 在jvm中当线程需要操作某个共享变量时会通过线程栈的变量地址将堆中该变量的值拷贝到线程本地内存中进行修改,
 * 在之后的某个时间点回写到堆内存中,当加上volatile修饰的变量在修改后会立即写入到主堆内存中,并且在硬件层面会
 * 触发cpu共享一致性协议,即当检测到某个cpu对共享变量进行了写操作,则cpu缓存中对应该地址的数据会失效，这样就保证
 * 了其它线程在读取该共享变量时不会出现不一致性。
 * 2、指令的有序性
 * java模型允许编译器对指令进行重排序,但重排序过程不会影响到单线程程序的执行,却会影响到多线程并发执行的正确性。
 */
class Volatile_ {

}

object Volatile_ {
    @volatile
    var a = 0

    /**
     * 无法保证操作的原子性,即结果不一定是1000，这是由于当两个线程同时读到了一样的数据进行自增操作。
     */
    def nonAtom: Unit = {
        for (i <- 0 until 1000) {
            new Thread(new Runnable {
                override def run(): Unit = {
                    Thread.sleep(1000)
                    a += 1
                    println(a)
                }
            }).start()
        }
    }


    def main(args: Array[String]): Unit = {
        nonAtom
    }
}
