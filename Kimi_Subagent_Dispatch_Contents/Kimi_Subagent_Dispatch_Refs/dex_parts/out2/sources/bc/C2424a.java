package bc;

import Ab.E;
import Ab.InterfaceC0079y;
import H4.b;
import I7.c;
import M3.G;
import M3.o;
import M3.p;
import M3.z;
import Zd.B;
import android.graphics.Typeface;
import android.os.Message;
import com.google.android.gms.internal.measurement.C2651b4;
import com.google.android.gms.internal.measurement.C2663d4;
import com.google.android.gms.internal.measurement.C2669e4;
import com.google.android.gms.internal.measurement.C2681g4;
import com.google.android.gms.internal.measurement.C2738r3;
import com.google.android.gms.internal.measurement.C2748t3;
import com.google.android.gms.internal.measurement.X3;
import com.google.android.gms.internal.measurement.p4;
import com.google.firebase.messaging.SendException;
import e2.C;
import e2.w;
import e2.y;
import h4.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import v9.r;
import vb.AbstractC4954o;

/* JADX INFO: renamed from: bc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C2424a implements InterfaceC0079y, b, c, p, k3.b, C, g, v9.p {
    public static final /* synthetic */ C2424a b = new C2424a(1);
    public static final /* synthetic */ C2424a c = new C2424a(2);
    public static final /* synthetic */ C2424a d = new C2424a(3);
    public static final /* synthetic */ C2424a e = new C2424a(4);
    public static final /* synthetic */ C2424a f = new C2424a(5);
    public static final /* synthetic */ C2424a g = new C2424a(6);
    public static final /* synthetic */ C2424a h = new C2424a(7);
    public static final /* synthetic */ C2424a i = new C2424a(8);
    public final /* synthetic */ int a;

    public /* synthetic */ C2424a(int i2) {
        this.a = i2;
    }

    public static Typeface e(String str, w wVar, int i2) {
        if (i2 == 0 && Intrinsics.b(wVar, w.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iF = AbstractC4954o.f(wVar, i2);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iF) : Typeface.create(str, iF);
    }

    public static B k(String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "toolName");
        Yk.b bVar = B.u1;
        bVar.getClass();
        Sk.B b2 = new Sk.B(6, bVar);
        while (true) {
            if (!b2.hasNext()) {
                next = null;
                break;
            }
            next = b2.next();
            if (((B) next).a.equals(str)) {
                break;
            }
        }
        B b3 = (B) next;
        return b3 == null ? B.c : b3;
    }

    public static String l(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    public int a() {
        return 5;
    }

    public int b() {
        return 80;
    }

    public Typeface c(y yVar, w wVar, int i2) {
        String strConcat = yVar.f;
        int i3 = wVar.a / 100;
        if (i3 >= 0 && i3 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i3 && i3 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i3 != 4) {
            if (i3 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i3 || i3 >= 8) && 8 <= i3 && i3 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceE = e(strConcat, wVar, i2);
            if (!Intrinsics.b(typefaceE, Typeface.create(Typeface.DEFAULT, AbstractC4954o.f(wVar, i2))) && !Intrinsics.b(typefaceE, e(null, wVar, i2))) {
                typeface = typefaceE;
            }
        }
        return typeface == null ? e(yVar.f, wVar, i2) : typeface;
    }

    public boolean d(Runnable runnable, Object obj) {
        Message message;
        r rVar = (r) obj;
        return (rVar == null || (message = rVar.a) == null || !runnable.equals(message.getCallback())) ? false : true;
    }

    public z f() {
        return new M3.r(-9223372036854775807L);
    }

    public long g(o oVar) {
        return -1L;
    }

    public void h(long j) {
    }

    public void i() {
    }

    public void j(int i2, Object obj) {
    }

    public void q() {
        throw new UnsupportedOperationException();
    }

    public void x(z zVar) {
        throw new UnsupportedOperationException();
    }

    public G y(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // Ab.InterfaceC0079y
    public Object zza() {
        switch (this.a) {
            case 1:
                List list = E.a;
                Boolean bool = (Boolean) p4.a.b();
                bool.getClass();
                return bool;
            case 2:
                List list2 = E.a;
                C2738r3.b.get();
                Long l = (Long) C2748t3.U.b();
                l.getClass();
                return l;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                List list3 = E.a;
                C2738r3.b.get();
                Long l2 = (Long) C2748t3.i.b();
                l2.getClass();
                return l2;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                List list4 = E.a;
                C2651b4.b.get();
                Boolean bool2 = (Boolean) C2663d4.a.b();
                bool2.getClass();
                return bool2;
            case 5:
                List list5 = E.a;
                C2738r3.b.get();
                return Integer.valueOf((int) ((Long) C2748t3.p.b()).longValue());
            case 6:
                List list6 = E.a;
                C2738r3.b.get();
                Boolean bool3 = (Boolean) C2748t3.c.b();
                bool3.getClass();
                return bool3;
            case 7:
                List list7 = E.a;
                C2669e4.b.get();
                Boolean bool4 = (Boolean) C2681g4.f.b();
                bool4.getClass();
                return bool4;
            default:
                return new Boolean(((Boolean) X3.a.b()).booleanValue());
        }
    }

    public C2424a(ln.z zVar) {
        this.a = 13;
        Intrinsics.checkNotNullParameter(zVar, "block");
    }

    public Typeface a(w wVar, int i2) {
        return e(null, wVar, i2);
    }
}
