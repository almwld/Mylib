package W0;

import N1.C0431v;
import N1.InterfaceC0401d0;
import P1.C0471h;
import P1.C0473i;
import P1.C0474j;
import P1.InterfaceC0475k;
import Q1.AbstractC0534w0;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;
import c1.C1007c;
import c1.C1040t;
import c1.InterfaceC1014f0;
import c1.InterfaceC1031o;
import c1.InterfaceC1039s0;
import k1.C1466c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.C1499B;
import p1.AbstractC1816a;
import p1.C1818c;
import p1.C1830o;
import p1.InterfaceC1833r;
import r0.InterfaceC1941l;
import s3.AbstractC1983e;
import t0.AbstractC2025n;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9009a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1.Q f9010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f9012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f9013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f9014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1466c f9015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f9016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9018j;
    public final /* synthetic */ Object k;

    public Y(androidx.compose.material3.a aVar, boolean z10, j0.P p8, InterfaceC1014f0 interfaceC1014f0, l0.B0 b02, w1.Q q10, long j2, float f10, float f11, C1466c c1466c) {
        this.f9016h = aVar;
        this.f9013e = z10;
        this.f9017i = p8;
        this.f9018j = interfaceC1014f0;
        this.k = b02;
        this.f9010b = q10;
        this.f9011c = j2;
        this.f9012d = f10;
        this.f9014f = f11;
        this.f9015g = c1466c;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.f9009a;
        Object obj3 = this.k;
        Object obj4 = this.f9018j;
        Object obj5 = this.f9017i;
        Object obj6 = this.f9016h;
        switch (i4) {
            case 0:
                InterfaceC1031o interfaceC1031o = (InterfaceC1031o) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1040t c1040t = (C1040t) interfaceC1031o;
                if (c1040t.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0623b0 c0623b0 = (C0623b0) ((androidx.compose.material3.a) obj6);
                    AbstractC0694r0.a(androidx.compose.ui.layout.a.b(C1830o.f23106a, new Af.h(this.f9013e, c0623b0.f9094j, c0623b0.k, 4)), (j0.P) obj5, (InterfaceC1014f0) obj4, (l0.B0) obj3, this.f9010b, this.f9011c, this.f9012d, this.f9014f, this.f9015g, c1040t, 384);
                } else {
                    c1040t.b0();
                }
                return Unit.a;
            default:
                InterfaceC1031o interfaceC1031o2 = (InterfaceC1031o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1040t c1040t2 = (C1040t) interfaceC1031o2;
                if (c1040t2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0431v c0431v = AbstractC0671l0.f9353a;
                    InterfaceC1833r interfaceC1833rThen = androidx.compose.foundation.a.e(J2.b(((InterfaceC1833r) obj6).then(MinimumInteractiveModifier.f12171a), this.f9010b, J2.c(this.f9011c, this.f9012d, c1040t2), (C1499B) obj5, ((n2.c) c1040t2.j(AbstractC0534w0.f7111h)).l0(this.f9014f)), (InterfaceC1941l) obj4, N1.a(0.0f, 7, 0L, false), this.f9013e, null, (Function0) obj3, 24).then(new ChildSemanticsNodeElement(new Xg.a(6)));
                    InterfaceC0401d0 interfaceC0401d0D = AbstractC2025n.d(C1818c.f23080a, true);
                    int iHashCode = Long.hashCode(c1040t2.f13503T);
                    InterfaceC1039s0 interfaceC1039s0L = c1040t2.l();
                    InterfaceC1833r interfaceC1833rD = AbstractC1816a.d(c1040t2, interfaceC1833rThen);
                    InterfaceC0475k.f6514R0.getClass();
                    C0473i c0473i = C0474j.f6480b;
                    if (c1040t2.f13505a == null) {
                        C1007c.v();
                        throw null;
                    }
                    c1040t2.l0();
                    if (c1040t2.f13502S) {
                        c1040t2.k(c0473i);
                    } else {
                        c1040t2.v0();
                    }
                    C1007c.G(c1040t2, interfaceC0401d0D, C0474j.f6484f);
                    C1007c.G(c1040t2, interfaceC1039s0L, C0474j.f6483e);
                    C0471h c0471h = C0474j.f6485g;
                    if (c1040t2.f13502S || !Intrinsics.b(c1040t2.T(), Integer.valueOf(iHashCode))) {
                        A8.b.r(iHashCode, c1040t2, iHashCode, c0471h);
                    }
                    C1007c.G(c1040t2, interfaceC1833rD, C0474j.f6482d);
                    AbstractC1983e.p(0, this.f9015g, c1040t2, true);
                } else {
                    c1040t2.b0();
                }
                return Unit.a;
        }
    }

    public Y(InterfaceC1833r interfaceC1833r, w1.Q q10, long j2, float f10, C1499B c1499b, InterfaceC1941l interfaceC1941l, boolean z10, Function0 function0, float f11, C1466c c1466c) {
        this.f9016h = interfaceC1833r;
        this.f9010b = q10;
        this.f9011c = j2;
        this.f9012d = f10;
        this.f9017i = c1499b;
        this.f9018j = interfaceC1941l;
        this.f9013e = z10;
        this.k = function0;
        this.f9014f = f11;
        this.f9015g = c1466c;
    }
}
