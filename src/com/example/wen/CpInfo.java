package com.example.wen;

/**
 * constant pool
 */
public class CpInfo {
    public static final int CONSTANT_Class = 7;
    public static final int CONSTANT_Fieldref = 9;
    public static final int CONSTANT_Methodref = 10;
    public static final int CONSTANT_InterfaceMethodref = 11;
    public static final int CONSTANT_String = 8;
    public static final int CONSTANT_Integer = 3;
    public static final int CONSTANT_Float = 4;
    public static final int CONSTANT_Long = 5;
    public static final int CONSTANT_Double = 6;
    public static final int CONSTANT_NameAndType = 12;
    public static final int CONSTANT_Utf8 = 1;
    public static final int CONSTANT_MethodHandle = 15;
    public static final int CONSTANT_MethodType = 16;
    public static final int CONSTANT_InvokeDynamic = 18;


    public static class ConstantClassInfo extends CpInfo {
        /*CONSTANT_Class_info {
            u1 tag;
            u2 name_index;
        }*/

        int tag;
        int nameIndex;
    }

    public static class ConstantFieldRefInfo extends CpInfo {
        /*CONSTANT_Fieldref_info {
            u1 tag;
            u2 class_index;
            u2 name_and_type_index;
        }*/

        int tag;
        int classIndex;
        int nameAndTypeIndex;
    }


    public static class ConstantMethodRefInfo extends CpInfo {
       /* CONSTANT_Methodref_info {
            u1 tag;
            u2 class_index;
            u2 name_and_type_index;
        }*/

        int tag;
        int classIndex;
        int nameAndTypeIndex;
    }

    public static class ConstantInterfaceMethodRefInfo extends CpInfo {
        /*CONSTANT_InterfaceMethodref_info {
            u1 tag;
            u2 class_index;
            u2 name_and_type_index;
        }*/

        int tag;
        int classIndex;
        int nameAndTypeIndex;
    }

    public static class ConstantStringInfo extends CpInfo {
        /*CONSTANT_String_info {
            u1 tag;
            u2 string_index;
        }*/

        int tag;
        int stringIndex;
    }

    public static class ConstantIntegerInfo extends CpInfo {
        /*CONSTANT_Integer_info {
            u1 tag;
            u4 bytes;
        }*/

        int tag;
        int bytesInteger;
    }

    public static class ConstantFloatInfo extends CpInfo {
        /*CONSTANT_Integer_info {
            u1 tag;
            u4 bytes;
        }*/

        int tag;
        float bytesFloat;
    }

    public static class ConstantLongInfo extends CpInfo {
//        CONSTANT_Long_info {
//            u1 tag;
//            u4 high_bytes;
//            u4 low_bytes;
//        }

        int tag;
        long bytesLong;
    }

    public static class ConstantDoubleInfo extends CpInfo {
//        CONSTANT_Long_info {
//            u1 tag;
//            u4 high_bytes;
//            u4 low_bytes;
//        }

        int tag;
        double bytesDouble;
    }

    public static class ConstantNameAndTypeInfo extends CpInfo {
        /*CONSTANT_NameAndType_info {
            u1 tag;
            u2 name_index;
            u2 descriptor_index;
        }*/

        int tag;
        int nameIndex;
        int descriptorIndex;
    }

    public static class ConstantUtf8Info extends CpInfo {
        /*CONSTANT_Utf8_info {
            u1 tag;
            u2 length;
            u1 bytes[length];
        }*/

        int tag;
        String bytesUtf8;
    }

    public static class ConstantMethodHandleInfo extends CpInfo {
        /*CONSTANT_MethodHandle_info {
            u1 tag;
            u1 reference_kind;
            u2 reference_index;
        }*/

        int tag;
        String bytesUtf8;
    }

}
