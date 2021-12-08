// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __darwin_fp_status {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__invalid"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__denorm"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__zdiv"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__ovrfl"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__undfl"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__precis"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__stkflt"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__errsumm"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c0"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c1"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c2"),
            MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("__tos"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c3"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__busy")
        )
    ).withName("__darwin_fp_status");
    public static MemoryLayout $LAYOUT() {
        return __darwin_fp_status.$struct$LAYOUT;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


