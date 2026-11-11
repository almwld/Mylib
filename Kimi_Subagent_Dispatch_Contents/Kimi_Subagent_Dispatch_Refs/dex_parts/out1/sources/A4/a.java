package A4;

import A8.b;
import C0.f;
import D.AbstractC0096c;
import D0.H0;
import N1.InterfaceC0401d0;
import N1.r;
import P1.C0471h;
import P1.C0473i;
import P1.C0474j;
import P1.InterfaceC0475k;
import R0.Q0;
import Ui.g;
import Ui.q;
import Zd.D;
import Zd.E;
import androidx.compose.foundation.layout.d;
import c1.C1007c;
import c1.C1040t;
import c1.InterfaceC1031o;
import c1.InterfaceC1039s0;
import ej.B;
import je.Z;
import kd.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p1.AbstractC1816a;
import p1.C1818c;
import p1.C1830o;
import p1.InterfaceC1833r;
import t0.AbstractC2025n;
import ub.A6;
import vb.b4;
import vb.x2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f49b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50c;

    public /* synthetic */ a(E e10, boolean z10) {
        this.f48a = 3;
        this.f50c = e10;
        this.f49b = z10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0096c.b(this.f49b, (Function2) this.f50c, (InterfaceC1031o) obj, C1007c.J(1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                H0.j((Q0) this.f50c, this.f49b, (InterfaceC1031o) obj, C1007c.J(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                A6.a(this.f49b, (Function1) this.f50c, (InterfaceC1031o) obj, C1007c.J(1));
                return Unit.a;
            case 3:
                E e10 = (E) this.f50c;
                InterfaceC1031o interfaceC1031o = (InterfaceC1031o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1040t c1040t = (C1040t) interfaceC1031o;
                if (c1040t.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = e10.f();
                    C1830o c1830o = C1830o.f23106a;
                    if (zF || !this.f49b) {
                        c1040t.h0(-1025101161);
                        InterfaceC1833r interfaceC1833rN = d.n(c1830o, 20);
                        D d10 = D.c;
                        yd.H0.f(interfaceC1833rN, B.w0(b4.b(d10.a), e10.f(), d10.b, ((g) c1040t.j(q.a)).E(), (r) null, c1040t, 0, 496), c1040t, 6);
                        c1040t.q(false);
                    } else {
                        c1040t.h0(-1025380471);
                        InterfaceC1833r interfaceC1833rB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.n(d.n(c1830o, 20), (float) 7.5d), ((g) c1040t.j(q.a)).E(), f.f439a);
                        InterfaceC0401d0 interfaceC0401d0D = AbstractC2025n.d(C1818c.f23080a, false);
                        int iHashCode = Long.hashCode(c1040t.f13503T);
                        InterfaceC1039s0 interfaceC1039s0L = c1040t.l();
                        InterfaceC1833r interfaceC1833rD = AbstractC1816a.d(c1040t, interfaceC1833rB);
                        InterfaceC0475k.f6514R0.getClass();
                        C0473i c0473i = C0474j.f6480b;
                        if (c1040t.f13505a == null) {
                            C1007c.v();
                            throw null;
                        }
                        c1040t.l0();
                        if (c1040t.f13502S) {
                            c1040t.k(c0473i);
                        } else {
                            c1040t.v0();
                        }
                        C1007c.G(c1040t, interfaceC0401d0D, C0474j.f6484f);
                        C1007c.G(c1040t, interfaceC1039s0L, C0474j.f6483e);
                        C0471h c0471h = C0474j.f6485g;
                        if (c1040t.f13502S || !Intrinsics.b(c1040t.T(), Integer.valueOf(iHashCode))) {
                            b.r(iHashCode, c1040t, iHashCode, c0471h);
                        }
                        C1007c.G(c1040t, interfaceC1833rD, C0474j.f6482d);
                        c1040t.q(true);
                        c1040t.q(false);
                    }
                } else {
                    c1040t.b0();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                Wg.b.k(this.f49b, (Z) this.f50c, (InterfaceC1031o) obj, C1007c.J(65));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                x2.c((f1) this.f50c, this.f49b, (InterfaceC1031o) obj, C1007c.J(7));
                return Unit.a;
        }
    }

    public /* synthetic */ a(Object obj, boolean z10, int i4, int i9) {
        this.f48a = i9;
        this.f50c = obj;
        this.f49b = z10;
    }

    public /* synthetic */ a(boolean z10, Object obj, int i4, int i9) {
        this.f48a = i9;
        this.f49b = z10;
        this.f50c = obj;
    }
}
