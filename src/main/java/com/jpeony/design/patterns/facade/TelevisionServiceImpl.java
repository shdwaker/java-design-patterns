package com.jpeony.design.patterns.facade;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: TelevisionServiceImpl
 * @Package: com.lanhuigu.design.facade.demo1
 * @date 2018/3/19 16:18
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class TelevisionServiceImpl implements TelevisionService {
    @Override
    public void openTelevision() {
        // TODO Auto-generated method stub
        System.out.println("下班的时候打开电视，看电视");
    }

    @Override
    public void offTelevision() {
        // TODO Auto-generated method stub
        System.out.println("上班的时候关掉电视，去上班");
    }
}
