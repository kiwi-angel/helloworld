package cn.edu.ruc.info.regularexpression;

import java.util.regex.Pattern;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/7/3
 */
public class RegularExpression {

    public final static String REGULAR_EXPRESSION_URL_1 = "^[a-zA-z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\S*)?$"; // 匹配url
    public final static String REGULAR_EXPRESSION_URL_2 = "[a-zA-z]+://[^\\s]*"; // 匹配url
    public final static String REGULAR_EXPRESSION_URL_3 = "^([hH][tT]{2}[pP]|[hH][tT]{2}[pP][sS])+://(\\w+(-\\w+)*)(.cgtn.com)(\\?\\S*)?$";
    public final static String REGULAR_EXPRESSION_URL_5 = "^(https|http)?:\\/\\/www.cgtn.com/[^\\s]+";
    public final static String REGULAR_EXPRESSION_URL_6 = "^(https|http)?:\\/\\/videoru.cgtn.com/[^\\s]+";
    public final static String REGULAR_EXPRESSION_URL_4 = "^(https|http)?://www.cgtn.com/[^\\s]+";

    //[*].cgtn.com
    private final static String[] serviceConfig = {"*.cgtn.com", "*.cctv.com"};

    public static void main(String[] argv){
        String url1 = "http://www.cgtn.com/asdf";
        String url = "https://www.cgtn.com/editor/2018-06-15/3d3d514f7939476470525752/video/a36b9d5b722947d8bda35b5960339247/a36b9d5b722947d8bda35b5960339247.m3u8";
        RegularExpression r = new RegularExpression();

        boolean urlOK = r.hello(url);
        System.out.println("urlOK : " + urlOK );

        Pattern pattern = Pattern.compile(REGULAR_EXPRESSION_URL_4);
        System.out.println(pattern.toString());
        System.out.println(pattern.matcher(REGULAR_EXPRESSION_URL_4).groupCount());
    }

    public boolean hello(String url) {
        Pattern pattern = Pattern.compile(REGULAR_EXPRESSION_URL_4);
        if (pattern.matcher(url).matches()) {
            System.out.println("是正确的网址");
            return true;
        } else {
            System.out.println("非法网址");
            return false;
        }
    }

    private boolean urlRegularExpression(String url){
        Boolean isMatch = false;
        String regex = "^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$";
        String[] regularExpression = serviceConfig;
        for (String pattern : regularExpression){
            Pattern p = Pattern.compile(pattern);
            isMatch = p.matcher(url).matches();
            if (isMatch) break;
        }
        return isMatch;
    }
}
