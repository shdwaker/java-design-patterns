package com.lanhuigu.design.component.demo1;

/**
 * Leaf: 组合对象的叶节点对象，叶节点对象没有字节点对象，并且定义了叶节点对象的行为
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: ProjectAssistant
 * @Package: com.lanhuigu.design.component.demo1
 * @date 2018/3/21 15:49
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class ProjectAssistant extends Employer {

    public ProjectAssistant(String name) {
        setName(name);
        employers = null;
    }

    @Override
    public void add(Employer employer) {
        System.out.println("添加项目助理叶节点");
    }

    @Override
    public void delete(Employer employer) {
        System.out.println("删除项目助理叶节点");
    }

}
