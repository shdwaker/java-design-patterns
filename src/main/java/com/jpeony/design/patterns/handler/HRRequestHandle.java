package com.jpeony.design.patterns.handler;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: $CLASS_NAME
 * @Package: com.lanhuigu.design.handler
 * @date 2018/3/13 20:24
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class HRRequestHandle implements RequestHandle {
    @Override
    public void handleRequest(Object request) {
        if (request instanceof DimisionRequest) {
            System.out.println("要离职， 人事部门审批");
        }
    }
}
