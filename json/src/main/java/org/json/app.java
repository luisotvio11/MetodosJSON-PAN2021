package org.json;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class app {
	
	// método main contém todos os métodos que serão executados durante a execução do programa
	
		public static void main(String[] args) {
			
		
			JSONObjectToArray();
			//JSONExampleArray1();
			//JSONExampleArray2();
			//JSONExampleStringer();
			//JSONExampleObject1();
			// JSONExampleObject2();
			//JSONExampleObject3();
			 //JSONExamplWriter();
			//XMLToExampleConversion();
			// XMLFromExampleConversion();
			//CookieToExampleConversion();
			//CookieFromExampleConversion(); 
			//JSONExampleTokener()	;
			//HTTPToExampleConversion();
			//HTTPFromExampleConversion();
			//CDLToExampleConversion();
			//CDLFromExampleConversion();
			//PropertyToExampleConversion();
			//PropertyFromExampleConversion();
		
		
}
		
		
		// método 1
		private static void JSONExampleArray1() {
				
				
			
				 String arrayStr = 
				            "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
				                "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
				            		"{"+
				                    "\"key1\":\"value1\","+
				                    "\"key2\":\"value2\","+
				                    "\"key3\":\"value3\","+
				                    "\"key4\":\"value4\""+
				                "},"+
				                "0,"+"\"-1\""+
				            "]";

				 // Acima estamos criando um array com chave e valor

				 
				  JSONArray array = new JSONArray(arrayStr);  // aqui estamos instanciando um objeto array da classe JSONArray que recebe entre parênteses o arrayStr
				  
				  
				  System.out.println("Values array: "+ array); // Aqui estamos imprimindo na tela o valor do array instanciado acima

				  
				  // aqui estamos criando um JSONArray de nome lista que recebe o  metodo listNumberArray, que parametriza um array.lengh (Tamanho do array)
				  JSONArray list = listNumberArray(array.length());
				  
				  // Aqui estamos imprimindo na tela a conversão do JSONArray para String
				  System.out.println("Label Array: "+ list.toString());
				  
				  // Aqui estamos definindo o método construtor de JSONObject
				  JSONObject object = array.toJSONObject(list);
				  
				  //Aqui estamos imprimindo o objeto final
				  System.out.println("Final JSONOBject: " + object);
			}

		
			
		// Esse método cria um JSONArray de label em que cada um é gerado por posição
			private static JSONArray listNumberArray(int max){
			
				JSONArray res = new JSONArray(); // AQUI estamos criando um for que percorrerá o JSONARRAY
				for (int i=0; i<max;i++) {
					
					res.put(String.valueOf(i));
				}
				return res;
			}
			
			// Método 2
			
			
			private static void JSONExampleArray2() {
				
				// Esse método criamos um Array vazio e adicionamos os elementos um a um
			
				  JSONArray array = new JSONArray();

				// Adicionando os elementos por put
				array.put("Luis Otávio");
				array.put(5);
				array.put(-23.45e67);
				array.put(true);
				
				

				 JSONArray list = listNumberArray(array.length());
				 JSONObject object = array.toJSONObject(list);
				 System.out.println("Final JSONOBject: " + object);
			}
		
			
			// Método 3
			
			
		
			private static void JSONExampleStringer() {

				// Aqui estamos trabalhando com JSONString

				JSONStringer jsonStringer = new JSONStringer();

				

		        jsonStringer.object();

		        //Adicionando elementos com chave e valor no JsonStringer

		        jsonStringer.key("trueValue").value(true);
		        jsonStringer.key("falseValue").value(false);
		        jsonStringer.key("nullValue").value(null);
		        jsonStringer.key("stringValue").value("hello world!");
		        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
		        jsonStringer.key("intValue").value(42);
		        jsonStringer.key("doubleValue").value(-23.45e67);

		        //Aqui finalizamos o procedimento com o .endObject

		        jsonStringer.endObject();

		       //Convertendo o jsonStringer em um JSONObject 

		        String str = jsonStringer.toString();
		        JSONObject jsonObject = new JSONObject(str);
		        
		       System.out.println("Final JSONOBject: " + jsonObject);
			}
			
			// Método 4
			
			
			
			
			private static void JSONExampleObject1() {

				// Criando um objeto JSONObject de uma String com o contrutor da classe
				String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
				JSONObject example = new JSONObject(string);
				System.out.println("Final JSONObject: " + example);
				
			}
			
			
			// Método 5
			
			private static void JSONExampleObject2() {

			
				
				//Aqui instanciamos o JSONObject diretamente sem outras funções
			
				JSONObject example = new JSONObject();


				// adicionando chave e valor por .put
				example.put("key", "value");

				
				example.put("key2", 5);
				example.put("key3", -23.45e67);
				example.put("trueValue", true);

				// Não podemos adicionar chave e valor nula

				
				
				 System.out.println("Final JSONOBject: " + example);
			}
			
			
			//método 6
			
			private static void JSONExampleObject3() {

				// Utilizando um JSONObject com Map


				Map<String,Double> map = new HashMap<String, Double>();
				
				map.put("key1", 1.0);
				map.put("key2", -23.45e67);
				
			

				JSONObject example = new JSONObject(map);
				 System.out.println("Final JSONOBject: " + example);
			}
			
			// Método 7
			
			private static void JSONExamplWriter() {
				
				//  Esse método precisa de um objeto Java chamado de Appendable. Abaixo está sendo utilizado o StringBuilder

				
				StringBuilder write = new StringBuilder(); // instanciando o objeto StringBuilder
				JSONWriter jsonWriter = new JSONWriter(write);  // instanciando o JsonWriter

				//adicionando chave e valor através do jsonWriter

				jsonWriter.object();
				
				jsonWriter.key("trueValue").value(true);
				jsonWriter.key("falseValue").value(false);
				jsonWriter.key("nullValue").value(null);
				jsonWriter.key("stringValue").value("hello world!");
				jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
				jsonWriter.key("intValue").value(42);
				jsonWriter.key("doubleValue").value(-23.45e67);
				
				jsonWriter.endObject();
				
			
				
				System.out.println("JSON: " + write.toString());
		
			}
			
			// Método 8
			private static void JSONExampleTokener() {

				// Criando um JSONTokener, O jsonTokener é utilizado para analisar strings de origen JSON
				
				String string = "this is not a valid JSON string";
				JSONTokener token = new JSONTokener(string);
				

				JSONObject object = new JSONObject(token);
				JSONArray array = new JSONArray(token);
				
			}
			
			// Método 9 Convertendo objetos
			
			private static void JSONObjectToArray() {
				
				
				String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

				JSONObject example = new JSONObject(string);
				
			
				
				JSONArray keyStrings = listNumberArray(example.length());
				
				//Convertendo um Objeto para arrays
				
				JSONArray array = example.toJSONArray(keyStrings);
				
				System.out.println("Final JSONArray: " + array);
			}
			
				// 	Método 9
			
			private static void XMLToExampleConversion() {

				//Convertendo JSON Object em XML com to String
				
				String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
				JSONObject example = new JSONObject(string);

	
				String output = XML.toString(example);
				System.out.println("Final XML: " + output);
			}
			
			// Método 10 Convertendo XML em JSONObject
			
			private static void XMLFromExampleConversion() {


				String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

			

				JSONObject output = XML.toJSONObject(string);
				
				System.out.println("Final JSONObject: " + output);
			}
			
			// Método 11
			
			private static void CookieToExampleConversion() {
				//Convertendo um JSONOBject em cookie
				String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
				JSONObject example = new JSONObject(string);
			
				String output = Cookie.toString(example);
				System.out.println("Final Cookie: " + output);
			}
			
			// método 12
			
			private static void CookieFromExampleConversion() {

				// Convertendo um cookie em JSONObject
				
				String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

			
				JSONObject output = Cookie.toJSONObject(string);
				System.out.println("Final JSONObject: " + output);
			}
			
			// método 13
			private static void HTTPToExampleConversion() {

				//Convertendo JSONOBject em uma String com Formato HTTP

				String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

				JSONObject example = new JSONObject(string);

				
				String output = HTTP.toString(example);
				System.out.println("Final HTTP: " + output);
			}
			
			// Método 14
			
			private static void HTTPFromExampleConversion() {

				// Convertendo uma String em formato http em um  JsonObject  

				String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

			

				JSONObject output = HTTP.toJSONObject(string);
				System.out.println("Final JSONObject: " + output);
			}
			
			
			// Método 15 
			
			private static void CDLToExampleConversion() {

				// Converendo JsonObject em format CDL

				String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
				JSONObject example = new JSONObject(string);
				
				String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
				JSONObject example2 = new JSONObject(string2);
				
				

				JSONArray array = new JSONArray();
				array.put(example);
				array.put(example2);

				
				String output = CDL.toString(array);
				System.out.println("Final CDL: \r\n" + output);
			}
			
			// Método 16
			private static void CDLFromExampleConversion() {

				// Convertendo um arquivo CDL em um JSONObject
				String string = "0,1,2,3\n"
						+ "value,5,-2.345E+68,true\n"
						+ "value2,6,-8.345E+68,false";
				
			

				JSONArray output = CDL.toJSONArray(string);
				System.out.println("Final JSONArray: " + output);
			}
			
			private static Properties PropertyToExampleConversion() {

				// Convertendo JSONObject em property
				String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
				JSONObject example = new JSONObject(string);

				

				Properties output = Property.toProperties(example);
				System.out.println("Final Properties: " + output);

				return output;
				}
			
			private static void PropertyFromExampleConversion() {

				// Convertendo property em JSONObject

				Properties input = PropertyToExampleConversion();

				

				JSONObject output = Property.toJSONObject(input);
				System.out.println("Final JSONObject: " + output);
			}
			
			
	}

	

