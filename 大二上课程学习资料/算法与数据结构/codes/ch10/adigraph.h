/* 用邻接矩阵实现有向图 */
/* 
使用时前置语句 
#include "adigraph.h"
*/

#ifndef AdjacencyDigraph_
#define AdjacencyDigraph_

#include "adgnode.h"
#include "witem.h"
#include "make2db.h"

Graph Graphinit(int n)
{/* 创建n个孤立顶点的有向图 */
   Graph G=(Graph)malloc(sizeof *G);
   G->n=n;
   G->e=0;
   G->a=Make2DArray(G->n+1,G->n+1,0);
   return G;
}

int GraphEdges(Graph G)
{/* 边数 */
    return G->e;
}

int GraphVertices(Graph G)
{/* 顶点数 */
    return G->n;
}

int GraphExist(int i,int j,Graph G)
{/* 边(i,j)是否存在 */
   if(i<1 || j<1 || i>G->n || j>G->n || G->a[i][j]==0)return 0;
   return 1;
}

void GraphAdd(int i, int j, Graph G)
{/* 加入有向边(i,j) */
   if (i < 1 || j < 1 || i > G->n || j > G->n || i == j || G->a[i][j] != 0)return;
   G->a[i][j]=1;
   G->e++;
}

void GraphDelete(int i, int j, Graph G)
{/* 删除边(i,j) */
   if(i<1 || j<1 || i>G->n || j>G->n || G->a[i][j]==0)return;
   G->a[i][j]=0;
   G->e--;
}

int OutDegree(int i,Graph G)
{/* 顶点i的出度 */
   int sum=0;
   if(i<1 || i>G->n)return -1;
   /* 统计出边 */
   for(int j=1;j<=G->n;j++)
      if(G->a[i][j]!=0)sum++;
   return sum;
}

int InDegree(int i,Graph G)
{/* 顶点i的入度 */
   int sum=0;
   if(i<1 || i>G->n)return -1;
   /* 统计入边 */
   for(int j=1;j<=G->n;j++)
      if(G->a[j][i]!=0) sum++;
   return sum;
}

void GraphOut(Graph G)
{/* 输出邻接矩阵 */
   for(int i=1;i<=G->n;i++){
      for(int j=1;j<=G->n;j++)printf("%d  ",G->a[i][j]);
      printf("\n");
   }
}

#endif
