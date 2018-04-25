package cn.edu.ruc.info.jquerytreeview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/3/20
 */
// 构造树使用的节点数据结构
public class TreeNode {

    private int id;  // node id
    private String text;  // 页面显示字符串
    private Boolean isChecked;  // 标识是否被选中
    private List<TreeNode> children = new ArrayList<TreeNode>();  // 子节点列表

    public TreeNode(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", children=" + treeNodeChildToString() +
                '}';
    }

    public String treeNodeChildToString(){
        if (children.size() != 0){
            for (TreeNode i : children){
                return i.toString();
            }
        } else {
            return null;
        }
        return null;
    }

    public void printNode(){
        System.out.println(this.toString());
    }
}
