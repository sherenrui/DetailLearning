import java.util.HashMap;

/**
 * Created by Administrator on 2017/12/10.
 */
public class HashMapLearning {
//    JDK 1.7中的实现原理
//    HashMap底层是由数组和链表组合的结构
//    Entry[]中的每个Entry的属性如下

    HashMap<String,String> inter=new HashMap<String,String>();
//    JDK1.8实现原理
/*final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
               boolean evict) {
    Node<K,V>[] tab;
    Node<K,V> p;
    int n, i;
    //table是一个Node<>[]，判断这个table是否存在，是否为空，如果为空则调用resize()生成这个Node<K,V>[]，获得新生成的数组长度n
    if ((tab = table) == null || (n = tab.length) == 0)
        n = (tab = resize()).length;
    //n-1 & hash是将此node的hash值与n-1做与运算，获得下表，如果该数组该下表为空，则直接生成新的头结点，将键值对放入该节点；
    if ((p = tab[i = (n - 1) & hash]) == null)
        tab[i] = newNode(hash, key, value, null);
    else {
        Node<K,V> e; K k;
//        如果节点为空则将该节点值放入
        if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
            e = p;
//         如果新放入的节点是树类型，则放入树节点中
        else if (p instanceof TreeNode)
            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        else {
//        如果该下标下的值是链表或二叉树，则循环键，放入
            for (int binCount = 0; ; ++binCount) {
                if ((e = p.next) == null) {
                    p.next = newNode(hash, key, value, null);
                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                        treeifyBin(tab, hash);
                    break;
                }
                if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
//        如果出现key完全相同的情况，则根据onlyIfAbsent值，判断是否对已经存在的key值进行替换
        if (e != null) { // existing mapping for key
            V oldValue = e.value;
            if (!onlyIfAbsent || oldValue == null)
                e.value = value;
            afterNodeAccess(e);
            return oldValue;
        }
    }
//    fail-fast机制，用于最后进行多线程查询
    ++modCount;
//    如果Node长度超过了初始化长度*负载因子,则开始扩大长度
    if (++size > threshold)
        resize();
    afterNodeInsertion(evict);
    return null;
}*/
}
