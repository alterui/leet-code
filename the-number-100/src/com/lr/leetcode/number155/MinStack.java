package com.lr.leetcode.number155;

/**
 * @author liurui
 * @date 2020/1/30 17:32
 *
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
import java.util.*;

/**
 * 使用两个栈，一个栈正常存储数据，另外一个栈用来存最小值。
 */
public class MinStack {
    Stack<Integer> data;
    Stack<Integer> helper;
    /** initialize your data structure here. */


    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    //
    public void push(int x) {
        data.push(x);
        if(helper.isEmpty() || helper.peek()>= x){
            helper.push(x);
        }
    }

    public void pop() {

        if(data.pop().equals(helper.peek()) ){
            helper.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return helper.peek();


    }
}
