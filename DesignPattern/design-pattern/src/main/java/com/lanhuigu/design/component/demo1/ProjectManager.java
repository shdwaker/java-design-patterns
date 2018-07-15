package com.lanhuigu.design.component.demo1;

import java.util.ArrayList;

/**
 * Composite: 存储子部件，定义与子部件相关的操作
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: ProjectManager
 * @Package: com.lanhuigu.design.component.demo1
 * @date 2018/3/21 15:51
 */
public class ProjectManager extends Employer {

    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }

}
