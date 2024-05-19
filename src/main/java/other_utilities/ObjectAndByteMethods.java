/*
 * *
 *  * @author <Team 31>
 *
 */

package other_utilities;

import java.io.*;
/*https://stackoverflow.com/questions/2836646/java-serializable-object-to-byte-array*/
/*https://stackoverflow.com/questions/2836646/java-serializable-object-to-byte-array*/
public class ObjectAndByteMethods {
    public static byte[] serializable(Object o){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(bos)){
            out.writeObject(o);
            out.flush();
            return bos.toByteArray();
        }catch (Exception e){
            throw  new RuntimeException();
        }
    }
    public static Object deserialize(byte[] bytes){
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);

        try (ObjectInput in = new ObjectInputStream(bis)) {
            return in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
