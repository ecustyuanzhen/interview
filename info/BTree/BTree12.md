# 判断t1树是否有与t2树拓扑结构完全相同的子树

### 题目

给定彼此独立的两棵树头节点分别为t1和t2，判断t1中是否有与t2树拓扑结构完全相同的子树。

例如，图3-36所示的t1树和图3-37所示t2树

                 1                           2
            /         \                   /     \
          2            3                 4       5   
        /   \        /    \               \     /
       4     5      6      7               8   9
        \   /
         8 9

t1树有与t2树拓扑结构完全相同的子树，所以返回true。但是如果t1树和t2树分别如图3-38和3-39所示，则t1树就没有与t2树拓扑结构完全相同的子树，所以返回false

                1                          2
           /         \                  /     \
         2            3                4       5   
       /   \        /   \               \
      4     5      6     7                8  
       \   /
        8 9  

### ~~要求~~


### 难度

 ★ ★ ★ ☆

### 代码

 [Java源码实现](../../src/BTree/BTree12.java)
