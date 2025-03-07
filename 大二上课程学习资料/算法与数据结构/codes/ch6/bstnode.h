/* 二叉搜索树结点类型 */

typedef struct btnode *btlink;/* 二叉树结点指针类型 */
struct btnode{/* 二叉树结点结构 */
    TreeItem element;/* 二叉树结点标号（元素） */ 
    btlink left;/* 左子树 */ 
    btlink right;/* 右子树 */
    btlink parent;/* 父结点指针 */
    int bal;/* 结点平衡因子 */
}Btnode;

btlink NewBNode()
{/* 建新树结点 */
    return (btlink)malloc(sizeof(Btnode));
}

typedef struct bstree *BinaryTree;/* 二叉搜索树类型 */
typedef struct bstree{/* 二叉搜索树结构 */
      btlink root;/* 根结点指针 */
}BStree;

