package com.xuexiang.autosizetest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);

        int width = 800;
        int height = 480;
        int densityX = 120;
        int densityY = 120;
        double size = Math.sqrt(Math.pow(width / densityX, 2) + Math.pow(height / densityY, 2));
        System.out.println("size:" + size);


        float inch = 7F;
        int width1 = 1024;
        int height2 = 600;
//        double dpi = Math.sqrt(width1 * width1 + height2 * height2) / inch;
        double dpi = getDensityDpi(width1, height2, inch);
        System.out.println("dpi:" + dpi);
    }

    /**
     * 计算出设备屏幕密度
     *
     * @param inch    设备的物理尺寸(英寸)
     * @return
     */
    public static double getDensityDpi(int width, int height, float inch) {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)) / inch;
    }
}