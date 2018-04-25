package com.company.jquerytreeview;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/3/20
 */
public class TreeController {

    private TreeModel m_node0 = new TreeModel(0, "root", 0);
    private TreeModel m_node1 = new TreeModel(1,"node1", 0);
    private TreeModel m_node2 = new TreeModel(2,"node2", 0);
    private TreeModel m_node3 = new TreeModel(3,"node3", 0);
    private TreeModel m_node4 = new TreeModel(4,"node4", 0);
    private TreeModel m_node5 = new TreeModel(5,"node5", 0);
    private TreeModel m_node6 = new TreeModel(6,"node6", 0);
    private TreeModel m_node7 = new TreeModel(7,"node7", 0);
    private TreeModel m_node8 = new TreeModel(8,"node8", 0);
    private TreeModel m_node9 = new TreeModel(9,"node9", 0);

    private static List<TreeModel> m_nodes = new ArrayList<>();
    public static void initDate(){
        for (int i = 0; i < 10; i ++){
            m_nodes.add(new TreeModel(i, "root" + i, 0));
        }
    }
    //init tree
    public static void intiTree(){
        initDate();
        // 从数据库中获取初始数据 即构造的私有成员node0—node9
        // 首先将node转换为treeNode节点
        List<TreeNode> treeNodeList = new ArrayList<>();
        // 将初始的date放入node中
        for (int i = 0; i < 10; i ++){
            treeNodeList.add(new TreeNode(m_nodes.get(i).getId(), m_nodes.get(i).getText()));
        }

        for (TreeModel i : m_nodes){
            // 将元素放入对应的parentList中
            if (i.getParentId() != i.getId()){
                treeNodeList.get(i.getParentId()).getChildren().add(treeNodeList.get(i.getId()));
            }
        }

        for (TreeNode i : treeNodeList){
            i.printNode();
        }
    }

    public static void main(String[] argc){
        intiTree();
    }

    //将数据库查询结果转换为树形Bean
//    private List<PermissionTreeNode> initTree(List<AuthPermission> list){
//        if (list.size() == 0)
//            return null;
//        List<PermissionTreeNode> r = new ArrayList<>();
//        PermissionTreeNode root = new PermissionTreeNode((long) 0, "root", false, new ArrayList<>());
//        for (AuthPermission i : list) {
//            // 将数据库中元素添加到node节点中
//            PermissionTreeNode node = new PermissionTreeNode(i.getId(), i.getName(), true, new ArrayList<>());
//            r.add(node);
//        }
//
//        for (AuthPermission i : list){
//            if (i.getParentId() == null){
//                root.getChildernList().add(new PermissionTreeNode(i.getId(), i.getName(), true, new ArrayList<>()));
//            } else {
//                //将该节点挂载到parentId对应的节点上
//                PermissionTreeNode parentNode = new PermissionTreeNode(
//                        i.getParentId(), i.getParentName(),false, new ArrayList<>());//创建父节点
//                parentNode.getChildernList().add(new PermissionTreeNode(
//                        i.getId(), i.getName(), true, new ArrayList<>()));//将i节点挂在到父节点上  TODO 父节点要怎么处理？
//            }
//        }
//        return r;
//    }

}
