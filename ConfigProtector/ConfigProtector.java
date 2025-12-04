import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {

        String protectedconfig = configFile;

        for (String key: sensitiveKeys){

            Pattern pattern = Pattern.compile("(?<="+ Pattern.quote(key)+").*");
            Matcher matcher = pattern.matcher(protectedconfig);

            StringBuffer sb = new StringBuffer();

            if (matcher.find()){
                String value = matcher.group();
                String masked = "*".repeat(value.length());

                matcher.appendReplacement(sb, masked);
            }
            matcher.appendTail(sb);
            protectedconfig = sb.toString();
        }
        return protectedconfig;
        }
}