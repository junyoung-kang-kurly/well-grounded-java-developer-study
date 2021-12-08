// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$30 {

    static final FunctionDescriptor fputs$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fputs$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "fputs",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$30.fputs$FUNC, false
    );
    static final FunctionDescriptor fread$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fread$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "fread",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)J",
        constants$30.fread$FUNC, false
    );
    static final FunctionDescriptor freopen$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle freopen$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "freopen",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$30.freopen$FUNC, false
    );
    static final FunctionDescriptor fscanf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fscanf$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "fscanf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$30.fscanf$FUNC, true
    );
    static final FunctionDescriptor fseek$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle fseek$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "fseek",
        "(Ljdk/incubator/foreign/MemoryAddress;JI)I",
        constants$30.fseek$FUNC, false
    );
    static final FunctionDescriptor fsetpos$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fsetpos$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "fsetpos",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$30.fsetpos$FUNC, false
    );
}


