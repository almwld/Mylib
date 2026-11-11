package ti;

import Ab.C0047n;
import Dc.C0459a7;
import Dc.C0577o;
import Dc.C0639v;
import Ie.K0;
import Mc.C1513l3;
import Mc.I;
import Mm.C;
import Mm.E;
import Mm.P;
import P1.r;
import Rf.s;
import Uc.C2091s1;
import Uc.C2117z;
import Uc.V1;
import Uc.Y1;
import Uc.Z1;
import Uc.u3;
import Uc.x3;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import cn.jiguang.verifysdk.api.JVerifyLoginBtClickCallback;
import cn.jiguang.verifysdk.api.PrivacyBean;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.android.gms.internal.measurement.M1;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.KimiApplication;
import com.moonshot.kimichat.push.PushMessageReceiver;
import dg.C2978a;
import di.C3023k0;
import ej.G;
import fa.z0;
import j0.M0;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.text.MatchGroup;
import n1.p;
import pi.C4238e;
import ue.C4795f;
import ue.C4801l;
import ug.C4818h;
import v.z;
import wd.C5;
import wg.C5515O;
import wg.C5530e;
import wg.l0;
import wh.C5556e;
import xi.C5649o;
import xi.F;
import yd.C5685f;
import yd.C5692i0;
import yd.C5696k0;

/* JADX INFO: renamed from: ti.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class C4532b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C4532b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        C4795f c4795f;
        C0639v c0639v;
        Y6.k kVar;
        CharSequence charSequence;
        z0 z0Var;
        CharSequence charSequence2;
        Q5.g gVar;
        CharSequence charSequence3;
        C0459a7 c0459a7;
        CharSequence charSequence4;
        int largeMemoryClass;
        r rVar;
        int i = this.a;
        boolean z = false;
        String str = null;
        str = null;
        str = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                jk.d dVar = Sf.d.a;
                Tm.e eVar = P.a;
                E.z(dVar, Tm.d.c, (C) null, new C4537g((C4538h) obj, null), 2);
                return Unit.a;
            case 1:
                C4801l c4801l = (C4801l) obj;
                if (!(c4801l instanceof C4801l)) {
                    c4801l = null;
                }
                if (c4801l != null && (c4795f = c4801l.g) != null && (c0639v = (C0639v) c4795f.c) != null) {
                    str = c0639v.b;
                }
                return K0.A("Evict StreamService for chatName=", str);
            case 2:
                return K0.n(((Map.Entry) obj).getValue(), "视频压缩测试失败: ");
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                return "words =【" + ((MatchGroup) obj) + "】";
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                un.m mVar = (un.m) obj;
                mVar.getClass();
                try {
                    mVar.w.w(2, false, 0);
                    break;
                } catch (IOException e) {
                    un.b bVar = un.b.d;
                    mVar.a(bVar, bVar, e);
                }
                return Unit.a;
            case 5:
                return z.d(((C2091s1) obj).b.size(), "fetchRoomList: loaded ", " rooms");
            case 6:
                u3 u3Var = (u3) obj;
                String str2 = u3Var.a;
                x3 x3Var = u3Var.b;
                if (x3Var == null) {
                    x3.Companion.getClass();
                    x3Var = x3.h;
                }
                return z.g("Received typing event: roomId=", str2, ", member=", x3Var.b);
            case 7:
                C2117z c2117z = (C2117z) obj;
                return "Received chat status: chatId=" + c2117z.a + ", status=" + c2117z.c;
            case PushMessageReceiver.$stable /* 8 */:
                Y1 y1 = ((Z1) obj).a;
                V1 v1 = y1 != null ? V1.b : V1.a;
                if (y1 == null) {
                    Y1.Companion.getClass();
                    y1 = Y1.e;
                }
                return "Received notification event: eventCase=" + v1 + ", notificationsRead=" + y1;
            case 9:
                C1513l3 c1513l3 = (C1513l3) obj;
                return S0.b.i(c1513l3.b.size(), "loadMore: append success, merged=", ", nextToken=", c1513l3.a);
            case 10:
                I i2 = (I) obj;
                Intrinsics.checkNotNullParameter(i2, "<this>");
                if (C2978a.a) {
                    C0577o c0577o = i2.f;
                    if (c0577o != null && (c0459a7 = c0577o.k) != null && (charSequence4 = c0459a7.c) != null && charSequence4.length() > 0) {
                        C0459a7 c0459a72 = c0577o.k;
                        return "handleStream emitMerged: toolArgs = " + ((Object) (c0459a72 != null ? c0459a72.c : null));
                    }
                    if (c0577o != null && (gVar = c0577o.d) != null && (charSequence3 = (CharSequence) gVar.a) != null && charSequence3.length() > 0) {
                        Q5.g gVar2 = c0577o.d;
                        return "handleStream emitMerged: textContent = " + ((Object) (gVar2 != null ? (CharSequence) gVar2.a : null));
                    }
                    if (c0577o != null && (z0Var = c0577o.l) != null && (charSequence2 = (CharSequence) z0Var.d) != null && charSequence2.length() > 0) {
                        z0 z0Var2 = c0577o.l;
                        return "handleStream emitMerged: artifactContent = " + ((Object) (z0Var2 != null ? (CharSequence) z0Var2.d : null));
                    }
                    if (c0577o != null && (kVar = c0577o.g) != null && (charSequence = (CharSequence) kVar.b) != null && charSequence.length() > 0) {
                        Y6.k kVar2 = c0577o.g;
                        return "handleStream emitMerged: thinkContent = " + ((Object) (kVar2 != null ? (CharSequence) kVar2.b : null));
                    }
                }
                return BuildConfig.FLAVOR;
            case 11:
                Context context = (Context) ((S7.b) obj).b;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    Intrinsics.d(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                C3.z zVar = new C3.z((char) 0, 3);
                try {
                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                    Intrinsics.d(systemService2);
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                return new H8.c(new C0047n((long) (d * ((long) largeMemoryClass) * 1048576), zVar), zVar);
            case 12:
                C5530e c5530e = ((l0) obj).k;
                C4818h c4818h = new C4818h(c5530e.d().b().a, 1, null, null, null, 28);
                Intrinsics.checkNotNullParameter(c4818h, "<set-?>");
                c5530e.p.setValue(c4818h);
                return Unit.a;
            case 13:
                return "update comment refres: " + ((C5) obj);
            case 14:
                PrivacyBean privacyBean = (PrivacyBean) obj;
                return z.i(A8.b.l("showPrivacyDialog bean(name=", privacyBean.getName(), ", text=", privacyBean.getText(), "， url="), privacyBean.getUrl(), ", split=", privacyBean.getSeparator());
            case 15:
                JVerifyLoginBtClickCallback jVerifyLoginBtClickCallback = (JVerifyLoginBtClickCallback) obj;
                if (jVerifyLoginBtClickCallback != null) {
                    jVerifyLoginBtClickCallback.login();
                }
                return Unit.a;
            case 16:
                Intrinsics.checkNotNullParameter("phone", "<set-?>");
                M1.d = "phone";
                ((C5515O) obj).invoke();
                E.z(Sf.d.a, (CoroutineContext) null, (C) null, new C5556e(2, null), 3);
                return Unit.a;
            case 17:
                x0.C c = ((androidx.compose.foundation.lazy.layout.b) obj).j;
                if (c != null) {
                    P1.f.m(c);
                }
                return Unit.a;
            case 18:
                C5649o c5649o = (C5649o) obj;
                if (((String) c5649o.g.a.getValue()).length() > 0) {
                    p pVar = c5649o.i;
                    if (pVar == null || !pVar.isEmpty()) {
                        r rVarListIterator = pVar.listIterator();
                        do {
                            rVar = rVarListIterator;
                            if (!rVar.hasNext()) {
                                z = true;
                            }
                        } while (((F) ((xi.E) rVar.next()).f.a.getValue()) == F.d);
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 19:
                B4.c cVar = ((y4.l) obj).h;
                if (!cVar.i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar.j.d == androidx.lifecycle.o.a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                j0 j0VarL = q7.b.l(cVar.a, (h0) cVar.m.getValue(), 4);
                nl.d dVarB = J.a.b(B4.b.class);
                j0VarL.getClass();
                Intrinsics.checkNotNullParameter(dVarB, "modelClass");
                M0 m0 = (M0) j0VarL.a;
                Intrinsics.checkNotNullParameter(dVarB, "modelClass");
                String strJ = dVarB != null ? dVarB.j() : null;
                if (strJ != null) {
                    return m0.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strJ), dVarB).b;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 20:
                return "onDeepLinking: " + ((DeepLinkResult) obj);
            case 21:
                return "start: context=" + ((ContextWrapper) obj);
            case 22:
                return K0.A("Firebase appInstanceId:", ((C5685f) obj).a);
            case 23:
                return "KimiPublishRoute:" + ((C3023k0) obj);
            case 24:
                int i3 = KimiApplication.a;
                Locale locale = ((Configuration) obj).getLocales().get(0);
                return K0.A("onConfigurationChanged: processLanguageTag=", locale != null ? locale.toLanguageTag() : null);
            case 25:
                E.z(Sf.d.a, (CoroutineContext) null, (C) null, new C5696k0((C5692i0) obj, null), 3);
                return Unit.a;
            case 26:
                ((G) obj).f.invoke();
                return Unit.a;
            case 27:
                return "requestWxSubscription resp = " + ((s) obj);
            case 28:
                return "launchBillingFlowInternal_start: payParams=" + ((C4238e) obj);
            default:
                W8.j jVar = (W8.j) obj;
                W8.e eVar2 = jVar.a;
                List list = jVar.b;
                return "queryProductDetails: billingResult=" + eVar2 + ", productDetailsListSize=" + (list != null ? Integer.valueOf(list.size()) : null);
        }
    }
}
