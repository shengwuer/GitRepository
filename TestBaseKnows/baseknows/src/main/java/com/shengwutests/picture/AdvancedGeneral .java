package com.shengwutests.picture;

/**
 * 动物图片识别
 *
 * @author :    xiedi
 * @since 1.0.0    2021/5/24 11:02
 */



import com.baidu.aip.util.Base64Util;
import com.shengwutests.baidutools.FileUtil;
import com.shengwutests.baidutools.HttpUtil;

import java.io.Serializable;
import java.net.URLEncoder;

/**
 * 通用物体和场景识别
 */
class AdvancedGeneral implements Serializable {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static String advancedGeneral() {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/image-classify/v2/advanced_general";

        try {
            // 本地文件路径
            String filePath = "E:\\src=http___dpic.tiankong.com_j2_zs_QJ6749697917.jpg&refer=http___dpic.tiankong.jpg";
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken =AuthService.getAuth();

            String result = HttpUtil.post(url, accessToken, param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        AdvancedGeneral.advancedGeneral();
    }
}