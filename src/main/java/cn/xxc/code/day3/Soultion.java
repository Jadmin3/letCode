package cn.xxc.code.day3;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jadmin
 */
public class Soultion {

    public int removeDuplicates(int[] nums) {
        //防止不传东西
        if (nums.length==0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        List ll = new ArrayList();
        ll.add("2020");
        ll.add("2021");
        List l2 = new ArrayList();
        l2.add("2020");
        l2.add("2020");
        l2.add("2020");
        l2.add("2021");
        l2.add("2021");
        List data = new ArrayList();

        for (int i = 0; i < ll.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (ll.get(i).equals(l2.get(j))) {

                    data.add(ll.get(i));
                }
            }
        }
        System.out.println(data.toString());

//
//     /*   Map<String, Object> map = new HashMap<String, Object>(4);
//        while (true) {
//            map.put("secret", "3JPoaXsC04xs/1//PJ2JQA==");
//            map.put("salt", "1611412194355");
//            System.out.println(JSONUtil.formatJsonStr(HttpUtil.post("http://api.im004.cn:81/config", map)));
//        }
//*/

    }





}
