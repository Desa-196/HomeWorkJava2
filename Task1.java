/* 1) Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

public class Task1
{
    public static void main(String[] args) {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(sql(json));
    }
    public static String sql(String json) {
        //Удаляем фигурные скобки
        json = json.replaceAll("\\{|\\}", "");
        StringBuilder sql = new StringBuilder("select * from students where ");
        //Разделяем нашу строку с json на массив по запятой
        String[] array = json.split(",");

        for (String string : array) {
            //Достаем ключ удаляем пробелы по краям и удаляем кавычки
            String key = string.split(":")[0].trim().replace("\"", "");
            //Достаем значение удаляем пробелы по краям и меняем одинарные кавычки на двойные
            String value = string.split(":")[1].trim().replace("\"", "'");
            if(!value.equals("\'null\'")) sql.append(key).append("=").append(value).append(" AND ");
        }
        //Удаляем последнюю end и возвращаем результат
        return sql.delete(sql.length() - 5, sql.length()-1).toString();
        
    }
}