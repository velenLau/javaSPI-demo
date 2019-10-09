package velen.spi;

/**
 * @author : 10066612
 * @project : jdkSPIdemo
 * @company : 浙江桔瓣科技有限公司
 * @date :  2019-10-09
 * Copyright @ 2019 JUBAN Technology Co.Ltd. – Confidential and Proprietary
 */
public class SpiServiceImplV2 implements SpiService{
    @Override
    public String sayHelloSpi() {
        return "hello spi v2 !";
    }
}
