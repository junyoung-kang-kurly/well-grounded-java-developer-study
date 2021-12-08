// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __darwin_i386_float_state {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, C_INT).withName("__fpu_reserved"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__invalid"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__denorm"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__zdiv"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__ovrfl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__undfl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__precis"),
                MemoryLayout.paddingLayout(2),
                MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("__pc"),
                MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("__rc"),
                MemoryLayout.paddingLayout(4)
            )
        ).withName("__fpu_fcw"),
        MemoryLayout.structLayout(
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
        ).withName("__fpu_fsw"),
        C_CHAR.withName("__fpu_ftw"),
        C_CHAR.withName("__fpu_rsrv1"),
        C_SHORT.withName("__fpu_fop"),
        C_INT.withName("__fpu_ip"),
        C_SHORT.withName("__fpu_cs"),
        C_SHORT.withName("__fpu_rsrv2"),
        C_INT.withName("__fpu_dp"),
        C_SHORT.withName("__fpu_ds"),
        C_SHORT.withName("__fpu_rsrv3"),
        C_INT.withName("__fpu_mxcsr"),
        C_INT.withName("__fpu_mxcsrmask"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm0"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm2"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm3"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm4"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm5"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm6"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm7"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm0"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm2"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm3"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm4"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm5"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm6"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm7"),
        MemoryLayout.sequenceLayout(224, C_CHAR).withName("__fpu_rsrv4"),
        C_INT.withName("__fpu_reserved1")
    ).withName("__darwin_i386_float_state");
    public static MemoryLayout $LAYOUT() {
        return __darwin_i386_float_state.$struct$LAYOUT;
    }
    public static MemorySegment __fpu_reserved$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment __fpu_fcw$slice(MemorySegment seg) {
        return seg.asSlice(8, 2);
    }
    public static MemorySegment __fpu_fsw$slice(MemorySegment seg) {
        return seg.asSlice(10, 2);
    }
    static final VarHandle __fpu_ftw$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("__fpu_ftw"));
    public static VarHandle __fpu_ftw$VH() {
        return __darwin_i386_float_state.__fpu_ftw$VH;
    }
    public static byte __fpu_ftw$get(MemorySegment seg) {
        return (byte)__darwin_i386_float_state.__fpu_ftw$VH.get(seg);
    }
    public static void __fpu_ftw$set( MemorySegment seg, byte x) {
        __darwin_i386_float_state.__fpu_ftw$VH.set(seg, x);
    }
    public static byte __fpu_ftw$get(MemorySegment seg, long index) {
        return (byte)__darwin_i386_float_state.__fpu_ftw$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_ftw$set(MemorySegment seg, long index, byte x) {
        __darwin_i386_float_state.__fpu_ftw$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_rsrv1$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("__fpu_rsrv1"));
    public static VarHandle __fpu_rsrv1$VH() {
        return __darwin_i386_float_state.__fpu_rsrv1$VH;
    }
    public static byte __fpu_rsrv1$get(MemorySegment seg) {
        return (byte)__darwin_i386_float_state.__fpu_rsrv1$VH.get(seg);
    }
    public static void __fpu_rsrv1$set( MemorySegment seg, byte x) {
        __darwin_i386_float_state.__fpu_rsrv1$VH.set(seg, x);
    }
    public static byte __fpu_rsrv1$get(MemorySegment seg, long index) {
        return (byte)__darwin_i386_float_state.__fpu_rsrv1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_rsrv1$set(MemorySegment seg, long index, byte x) {
        __darwin_i386_float_state.__fpu_rsrv1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_fop$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_fop"));
    public static VarHandle __fpu_fop$VH() {
        return __darwin_i386_float_state.__fpu_fop$VH;
    }
    public static short __fpu_fop$get(MemorySegment seg) {
        return (short)__darwin_i386_float_state.__fpu_fop$VH.get(seg);
    }
    public static void __fpu_fop$set( MemorySegment seg, short x) {
        __darwin_i386_float_state.__fpu_fop$VH.set(seg, x);
    }
    public static short __fpu_fop$get(MemorySegment seg, long index) {
        return (short)__darwin_i386_float_state.__fpu_fop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_fop$set(MemorySegment seg, long index, short x) {
        __darwin_i386_float_state.__fpu_fop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_ip$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_ip"));
    public static VarHandle __fpu_ip$VH() {
        return __darwin_i386_float_state.__fpu_ip$VH;
    }
    public static int __fpu_ip$get(MemorySegment seg) {
        return (int)__darwin_i386_float_state.__fpu_ip$VH.get(seg);
    }
    public static void __fpu_ip$set( MemorySegment seg, int x) {
        __darwin_i386_float_state.__fpu_ip$VH.set(seg, x);
    }
    public static int __fpu_ip$get(MemorySegment seg, long index) {
        return (int)__darwin_i386_float_state.__fpu_ip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_ip$set(MemorySegment seg, long index, int x) {
        __darwin_i386_float_state.__fpu_ip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_cs$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_cs"));
    public static VarHandle __fpu_cs$VH() {
        return __darwin_i386_float_state.__fpu_cs$VH;
    }
    public static short __fpu_cs$get(MemorySegment seg) {
        return (short)__darwin_i386_float_state.__fpu_cs$VH.get(seg);
    }
    public static void __fpu_cs$set( MemorySegment seg, short x) {
        __darwin_i386_float_state.__fpu_cs$VH.set(seg, x);
    }
    public static short __fpu_cs$get(MemorySegment seg, long index) {
        return (short)__darwin_i386_float_state.__fpu_cs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_cs$set(MemorySegment seg, long index, short x) {
        __darwin_i386_float_state.__fpu_cs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_rsrv2$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_rsrv2"));
    public static VarHandle __fpu_rsrv2$VH() {
        return __darwin_i386_float_state.__fpu_rsrv2$VH;
    }
    public static short __fpu_rsrv2$get(MemorySegment seg) {
        return (short)__darwin_i386_float_state.__fpu_rsrv2$VH.get(seg);
    }
    public static void __fpu_rsrv2$set( MemorySegment seg, short x) {
        __darwin_i386_float_state.__fpu_rsrv2$VH.set(seg, x);
    }
    public static short __fpu_rsrv2$get(MemorySegment seg, long index) {
        return (short)__darwin_i386_float_state.__fpu_rsrv2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_rsrv2$set(MemorySegment seg, long index, short x) {
        __darwin_i386_float_state.__fpu_rsrv2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_dp$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_dp"));
    public static VarHandle __fpu_dp$VH() {
        return __darwin_i386_float_state.__fpu_dp$VH;
    }
    public static int __fpu_dp$get(MemorySegment seg) {
        return (int)__darwin_i386_float_state.__fpu_dp$VH.get(seg);
    }
    public static void __fpu_dp$set( MemorySegment seg, int x) {
        __darwin_i386_float_state.__fpu_dp$VH.set(seg, x);
    }
    public static int __fpu_dp$get(MemorySegment seg, long index) {
        return (int)__darwin_i386_float_state.__fpu_dp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_dp$set(MemorySegment seg, long index, int x) {
        __darwin_i386_float_state.__fpu_dp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_ds$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_ds"));
    public static VarHandle __fpu_ds$VH() {
        return __darwin_i386_float_state.__fpu_ds$VH;
    }
    public static short __fpu_ds$get(MemorySegment seg) {
        return (short)__darwin_i386_float_state.__fpu_ds$VH.get(seg);
    }
    public static void __fpu_ds$set( MemorySegment seg, short x) {
        __darwin_i386_float_state.__fpu_ds$VH.set(seg, x);
    }
    public static short __fpu_ds$get(MemorySegment seg, long index) {
        return (short)__darwin_i386_float_state.__fpu_ds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_ds$set(MemorySegment seg, long index, short x) {
        __darwin_i386_float_state.__fpu_ds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_rsrv3$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_rsrv3"));
    public static VarHandle __fpu_rsrv3$VH() {
        return __darwin_i386_float_state.__fpu_rsrv3$VH;
    }
    public static short __fpu_rsrv3$get(MemorySegment seg) {
        return (short)__darwin_i386_float_state.__fpu_rsrv3$VH.get(seg);
    }
    public static void __fpu_rsrv3$set( MemorySegment seg, short x) {
        __darwin_i386_float_state.__fpu_rsrv3$VH.set(seg, x);
    }
    public static short __fpu_rsrv3$get(MemorySegment seg, long index) {
        return (short)__darwin_i386_float_state.__fpu_rsrv3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_rsrv3$set(MemorySegment seg, long index, short x) {
        __darwin_i386_float_state.__fpu_rsrv3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_mxcsr$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_mxcsr"));
    public static VarHandle __fpu_mxcsr$VH() {
        return __darwin_i386_float_state.__fpu_mxcsr$VH;
    }
    public static int __fpu_mxcsr$get(MemorySegment seg) {
        return (int)__darwin_i386_float_state.__fpu_mxcsr$VH.get(seg);
    }
    public static void __fpu_mxcsr$set( MemorySegment seg, int x) {
        __darwin_i386_float_state.__fpu_mxcsr$VH.set(seg, x);
    }
    public static int __fpu_mxcsr$get(MemorySegment seg, long index) {
        return (int)__darwin_i386_float_state.__fpu_mxcsr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_mxcsr$set(MemorySegment seg, long index, int x) {
        __darwin_i386_float_state.__fpu_mxcsr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_mxcsrmask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_mxcsrmask"));
    public static VarHandle __fpu_mxcsrmask$VH() {
        return __darwin_i386_float_state.__fpu_mxcsrmask$VH;
    }
    public static int __fpu_mxcsrmask$get(MemorySegment seg) {
        return (int)__darwin_i386_float_state.__fpu_mxcsrmask$VH.get(seg);
    }
    public static void __fpu_mxcsrmask$set( MemorySegment seg, int x) {
        __darwin_i386_float_state.__fpu_mxcsrmask$VH.set(seg, x);
    }
    public static int __fpu_mxcsrmask$get(MemorySegment seg, long index) {
        return (int)__darwin_i386_float_state.__fpu_mxcsrmask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_mxcsrmask$set(MemorySegment seg, long index, int x) {
        __darwin_i386_float_state.__fpu_mxcsrmask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __fpu_stmm0$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment __fpu_stmm1$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static MemorySegment __fpu_stmm2$slice(MemorySegment seg) {
        return seg.asSlice(72, 16);
    }
    public static MemorySegment __fpu_stmm3$slice(MemorySegment seg) {
        return seg.asSlice(88, 16);
    }
    public static MemorySegment __fpu_stmm4$slice(MemorySegment seg) {
        return seg.asSlice(104, 16);
    }
    public static MemorySegment __fpu_stmm5$slice(MemorySegment seg) {
        return seg.asSlice(120, 16);
    }
    public static MemorySegment __fpu_stmm6$slice(MemorySegment seg) {
        return seg.asSlice(136, 16);
    }
    public static MemorySegment __fpu_stmm7$slice(MemorySegment seg) {
        return seg.asSlice(152, 16);
    }
    public static MemorySegment __fpu_xmm0$slice(MemorySegment seg) {
        return seg.asSlice(168, 16);
    }
    public static MemorySegment __fpu_xmm1$slice(MemorySegment seg) {
        return seg.asSlice(184, 16);
    }
    public static MemorySegment __fpu_xmm2$slice(MemorySegment seg) {
        return seg.asSlice(200, 16);
    }
    public static MemorySegment __fpu_xmm3$slice(MemorySegment seg) {
        return seg.asSlice(216, 16);
    }
    public static MemorySegment __fpu_xmm4$slice(MemorySegment seg) {
        return seg.asSlice(232, 16);
    }
    public static MemorySegment __fpu_xmm5$slice(MemorySegment seg) {
        return seg.asSlice(248, 16);
    }
    public static MemorySegment __fpu_xmm6$slice(MemorySegment seg) {
        return seg.asSlice(264, 16);
    }
    public static MemorySegment __fpu_xmm7$slice(MemorySegment seg) {
        return seg.asSlice(280, 16);
    }
    public static MemorySegment __fpu_rsrv4$slice(MemorySegment seg) {
        return seg.asSlice(296, 224);
    }
    static final VarHandle __fpu_reserved1$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_reserved1"));
    public static VarHandle __fpu_reserved1$VH() {
        return __darwin_i386_float_state.__fpu_reserved1$VH;
    }
    public static int __fpu_reserved1$get(MemorySegment seg) {
        return (int)__darwin_i386_float_state.__fpu_reserved1$VH.get(seg);
    }
    public static void __fpu_reserved1$set( MemorySegment seg, int x) {
        __darwin_i386_float_state.__fpu_reserved1$VH.set(seg, x);
    }
    public static int __fpu_reserved1$get(MemorySegment seg, long index) {
        return (int)__darwin_i386_float_state.__fpu_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_reserved1$set(MemorySegment seg, long index, int x) {
        __darwin_i386_float_state.__fpu_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
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


