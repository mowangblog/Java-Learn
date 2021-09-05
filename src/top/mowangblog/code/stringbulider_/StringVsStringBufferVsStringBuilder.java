package top.mowangblog.code.stringbulider_;

/**
 * JavaStudy
 * 对比string stringBuffer stringBuilder 运行效率
 *
 * @author : Xuan Li
 * @date : 2021-09-05 15:03
 **/
@SuppressWarnings("all")
public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        String str = "";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringBuffer 运行时间："+(endTime-startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringBuilder 运行时间："+(endTime-startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            str += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("string 运行时间："+(endTime-startTime));

        //结果string 运行时间：1065
        //stringBuffer 运行时间：2
        //stringBuilder 运行时间：1
        //运行效率：stringBuilder > stringBuffer >结果string
    }
}
