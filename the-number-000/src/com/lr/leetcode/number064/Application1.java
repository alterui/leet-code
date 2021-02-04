package com.lr.leetcode.number064;

/**
 *
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 * 示例 2：
 *
 * 输入：grid = [[1,2,3],[4,5,6]]
 * 输出：12
 *  
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author liurui
 * @date 2021/2/4 3:20 下午
 */
public class Application1 {


    public static void main(String[] args) {
        int[][] arr = {{1,3,1}, {1,5,1}, {4,2,1}};
        new Application1().minPathSum(arr);
    }


    /**
     * f函数表示当前位置的最小路径总和，分为三步
     * 1，第一x轴
     * 2，第一y轴
     * 3，剩下的
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {

        int  x = grid.length;
        int y = grid[0].length;

        //f[][] 表示当前的最小路径总和
        int[][] f =new int[x][y];
        f[0][0] = grid[0][0];
        for(int i =1;i<x;i++){
            f[i][0] = f[i-1][0] + grid[i][0];
        }
        for(int i = 1 ;i < y ;i++){
            f[0][i] = f[0][i-1] + grid[0][i];
        }
        for(int i = 1;i<x;i++){
            for(int j = 1;j<y;j++){
                f[i][j] = Math.min(f[i-1][j],f[i][j-1]) + grid[i][j];
            }
        }

        return f[x-1][y-1];

    }
}
