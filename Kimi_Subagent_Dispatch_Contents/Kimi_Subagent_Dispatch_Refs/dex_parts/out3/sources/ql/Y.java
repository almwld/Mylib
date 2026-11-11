package ql;

import fl.C0929a;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C1098w;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import rl.C1428B;
import rl.C1429C;
import rl.InterfaceC1435f;
import wl.EnumC1590c;
import wl.InterfaceC1587J;
import wl.InterfaceC1591d;
import wl.InterfaceC1593f;
import wl.InterfaceC1599l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public final class Y implements Function0 {
    public final /* synthetic */ int a;
    public final C1342a0 b;

    public /* synthetic */ Y(C1342a0 c1342a0, int i) {
        this.a = i;
        this.b = c1342a0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listQ0;
        zl.t tVarV0;
        int i = this.a;
        C1342a0 c1342a0 = this.b;
        switch (i) {
            case 0:
                return E0.d(c1342a0.e());
            default:
                InterfaceC1587J interfaceC1587JE = c1342a0.e();
                int i2 = c1342a0.b;
                AbstractC1364s abstractC1364s = c1342a0.a;
                if (interfaceC1587JE instanceof zl.t) {
                    InterfaceC1591d interfaceC1591dP = abstractC1364s.p();
                    Zl.c cVar = E0.a;
                    Intrinsics.checkNotNullParameter(interfaceC1591dP, "<this>");
                    if (interfaceC1591dP.V() != null) {
                        InterfaceC1599l interfaceC1599lJ = interfaceC1591dP.j();
                        Intrinsics.e(interfaceC1599lJ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        tVarV0 = ((InterfaceC1593f) interfaceC1599lJ).v0();
                    } else {
                        tVarV0 = null;
                    }
                    if (Intrinsics.b(tVarV0, interfaceC1587JE) && abstractC1364s.p().f() == EnumC1590c.b) {
                        InterfaceC1599l interfaceC1599lJ2 = abstractC1364s.p().j();
                        Intrinsics.e(interfaceC1599lJ2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class clsJ = E0.j((InterfaceC1593f) interfaceC1599lJ2);
                        if (clsJ != null) {
                            return clsJ;
                        }
                        throw new Mm.D("Cannot determine receiver Java type of inherited declaration: " + interfaceC1587JE);
                    }
                }
                InterfaceC1435f interfaceC1435fG = abstractC1364s.g();
                if (!(interfaceC1435fG instanceof C1429C)) {
                    if (!(interfaceC1435fG instanceof C1428B)) {
                        return (Type) interfaceC1435fG.a().get(i2);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((C1428B) interfaceC1435fG).d.get(i2)).toArray(new Class[0]);
                    Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length = typeArr.length;
                    if (length != 0) {
                        return length != 1 ? new Z(typeArr) : (Type) C1098w.S(typeArr);
                    }
                    throw new C0929a("Expected at least 1 type for compound type");
                }
                if (abstractC1364s.s()) {
                    C1429C c1429c = (C1429C) interfaceC1435fG;
                    IntRange intRangeD = c1429c.d(i2 + 1);
                    int i3 = c1429c.d(0).b + 1;
                    listQ0 = CollectionsKt.q0(c1429c.b.a(), new IntRange(intRangeD.a - i3, intRangeD.b - i3, 1));
                } else {
                    C1429C c1429c2 = (C1429C) interfaceC1435fG;
                    listQ0 = CollectionsKt.q0(c1429c2.b.a(), c1429c2.d(i2));
                }
                Type[] typeArr2 = (Type[]) listQ0.toArray(new Type[0]);
                Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                int length2 = typeArr3.length;
                if (length2 != 0) {
                    return length2 != 1 ? new Z(typeArr3) : (Type) C1098w.S(typeArr3);
                }
                throw new C0929a("Expected at least 1 type for compound type");
        }
    }
}
