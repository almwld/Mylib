package o9;

import Ab.y;
import Dc.N;
import Dc.T6;
import Dc.d7;
import Dc.n;
import Dc.p3;
import Dc.q3;
import Dc.s3;
import En.h;
import H4.b;
import J.EnumC0297s;
import J.EnumC0299t;
import J.EnumC0301u;
import J.InterfaceC0303v;
import J.O0;
import M3.G;
import M3.m;
import M3.p;
import Zd.B;
import Zd.E;
import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.r3;
import com.google.android.gms.internal.measurement.t3;
import com.google.android.gms.internal.play_billing.x1;
import eb.d;
import j0.M0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import je.F0;
import je.O;
import je.k0;
import je.l0;
import k3.InterfaceC1473b;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nn.z;
import ua.e;
import ub.Q6;

/* JADX INFO: renamed from: o9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class C1731a implements y, b, InterfaceC0303v, p, e, InterfaceC1473b, eb.b, v9.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile UUID f22443b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f22444c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1731a f22445d = new C1731a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1731a f22446e = new C1731a(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1731a f22447f = new C1731a(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1731a f22448g = new C1731a(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1731a f22449h = new C1731a(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ C1731a f22450i = new C1731a(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1731a f22451j = new C1731a(7);
    public static final /* synthetic */ C1731a k = new C1731a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22452a;

    public /* synthetic */ C1731a(int i4) {
        this.f22452a = i4;
    }

    public static synchronized String l(Context context) {
        try {
            if (TextUtils.isEmpty(f22444c)) {
                new C1731a(context);
                UUID uuid = f22443b;
                if (uuid != null) {
                    f22444c = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22444c;
    }

    public static ArrayList m(List list) {
        Intrinsics.checkNotNullParameter(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((z) obj) != z.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(A.t(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((z) it.next()).a);
        }
        return arrayList2;
    }

    public static byte[] o(List list) {
        Intrinsics.checkNotNullParameter(list, "protocols");
        h hVar = new h();
        for (String str : m(list)) {
            hVar.i0(str.length());
            hVar.u0(str);
        }
        return hVar.G(hVar.b);
    }

    public static E r(boolean z10, n nVar, s3 s3Var, boolean z11) {
        Intrinsics.checkNotNullParameter(nVar, "block");
        Intrinsics.checkNotNullParameter(s3Var, "messageStatus");
        if (Intrinsics.b(s3Var, p3.d) && z11) {
            bc.a aVar = B.b;
            String str = nVar.p().b;
            aVar.getClass();
            if (bc.a.k(str) == B.q1) {
                List list = nVar.p().r;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!StringsKt.W(((d7) it.next()).c())) {
                        }
                    }
                }
                return E.b;
            }
        }
        boolean z12 = !nVar.p().r.isEmpty() || !z10 || nVar.p().d || Intrinsics.b(nVar.p().g, T6.d);
        return (z12 && (nVar.p().d || nVar.p().r.isEmpty())) ? E.d : z12 ? E.c : E.b;
    }

    public static /* synthetic */ E s(C1731a c1731a, boolean z10, n nVar) {
        q3 q3Var = q3.d;
        c1731a.getClass();
        return r(z10, nVar, q3Var, false);
    }

    public static k0 t(N n8) {
        Intrinsics.checkNotNullParameter(n8, "chatMessage");
        return new k0(n8, (l0) null, 0, new O((Zd.A) null, 61), (F0) null, 46);
    }

    public static final CharSequence u(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // J.InterfaceC0303v
    public O0 a() {
        return O0.f3745b;
    }

    public Object apply(Object obj) {
        return ((x1) obj).b();
    }

    @Override // J.InterfaceC0303v
    public int b() {
        return 1;
    }

    @Override // v9.p
    public boolean d(Runnable runnable, Object obj) {
        Message message = (Message) obj;
        return message != null && runnable.equals(message.getCallback());
    }

    public int e(Context context, String str, boolean z10) {
        return d.d(context, str, z10);
    }

    @Override // J.InterfaceC0303v
    public long f() {
        return -1L;
    }

    public int g(Context context, String str) {
        return d.a(context, str);
    }

    @Override // J.InterfaceC0303v
    public EnumC0301u h() {
        return EnumC0301u.f3928a;
    }

    @Override // H4.b
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // H4.b
    public void j(int i4, Object obj) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // J.InterfaceC0303v
    public EnumC0297s k() {
        return EnumC0297s.f3910a;
    }

    @Override // J.InterfaceC0303v
    public CaptureResult n() {
        return null;
    }

    @Override // J.InterfaceC0303v
    public EnumC0299t p() {
        return EnumC0299t.f3917a;
    }

    @Override // M3.p
    public void q() {
    }

    @Override // M3.p
    public void x(M3.z zVar) {
    }

    @Override // M3.p
    public G y(int i4, int i9) {
        return new m();
    }

    public Object zza() {
        switch (this.f22452a) {
            case 1:
                List list = Ab.E.a;
                r3.b.a();
                return (String) t3.e.b();
            case 2:
                List list2 = Ab.E.a;
                r3.b.a();
                Long l8 = (Long) t3.J.b();
                l8.getClass();
                return l8;
            case 3:
                List list3 = Ab.E.a;
                r3.b.a();
                Long l10 = (Long) t3.z.b();
                l10.getClass();
                return l10;
            case 4:
                List list4 = Ab.E.a;
                b4.b.a();
                return (String) d4.f.b();
            case 5:
                List list5 = Ab.E.a;
                r3.b.a();
                return (String) t3.c0.b();
            case 6:
                List list6 = Ab.E.a;
                r3.b.a();
                Boolean bool = (Boolean) t3.C.b();
                bool.getClass();
                return bool;
            case 7:
                List list7 = Ab.E.a;
                r3.b.a();
                return Integer.valueOf((int) ((Long) t3.m0.b()).longValue());
            default:
                return new Boolean(((Boolean) j4.a.b()).booleanValue());
        }
    }

    public C1731a(Context context) {
        String strD;
        this.f22452a = 0;
        if (f22443b == null) {
            synchronized (C1731a.class) {
                if (f22443b == null) {
                    M0 m0M = M0.m();
                    m0M.getClass();
                    String string = null;
                    try {
                        strD = Q6.d(((File) m0M.f20584d).getAbsolutePath());
                    } catch (Throwable unused) {
                        strD = null;
                    }
                    if (strD != null) {
                        f22443b = UUID.fromString(strD);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused2) {
                        }
                        try {
                            f22443b = string != null ? UUID.nameUUIDFromBytes(string.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused3) {
                        }
                        try {
                            M0 m0M2 = M0.m();
                            String string2 = f22443b.toString();
                            m0M2.getClass();
                            Q6.h((File) m0M2.f20584d, string2, false);
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
        }
    }
}
