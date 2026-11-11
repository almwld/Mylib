package Af;

import Dc.C0568n;
import Dc.C0636u5;
import Ee.C0751o;
import R0.h0;
import Zd.B;
import bc.C2424a;
import c1.h1;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import dg.C2978a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v0.v;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ m(h1 h1Var, int i) {
        this.a = i;
        this.b = h1Var;
    }

    public final Object invoke() {
        int i = this.a;
        h1 h1Var = this.b;
        switch (i) {
            case 0:
                C2424a c2424a = B.b;
                String str = ((C0568n) h1Var.getValue()).p().b;
                c2424a.getClass();
                return C2424a.k(str);
            case 1:
                if (!((Boolean) ((Ki.e) h1Var.getValue()).a.getValue()).booleanValue() && !((Boolean) ((Ki.e) h1Var.getValue()).c.getValue()).booleanValue() && !((Boolean) ((Ki.e) h1Var.getValue()).d.a.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                List list = (List) h1Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Yf.h.a.contains(((C0636u5) obj).d)) {
                        arrayList.add(obj);
                    }
                }
                List listV0 = CollectionsKt.v0(arrayList, 5);
                boolean z = C2978a.a;
                C2978a.a("ResearchHeader", null, new C0751o(1, listV0));
                return listV0;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                return Integer.valueOf(((List) h1Var.getValue()).size());
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                return new v1.b(((v1.b) h1Var.getValue()).a);
            case 5:
                j0.p pVar = h0.a;
                return new v1.b(((v1.b) h1Var.getValue()).a);
            case 6:
                return Boolean.valueOf(((Number) h1Var.getValue()).floatValue() > 0.0f);
            case 7:
                return Boolean.valueOf(((Number) h1Var.getValue()).floatValue() > 0.0f);
            case PushMessageReceiver.$stable /* 8 */:
                return new p1.h(((Number) h1Var.getValue()).floatValue());
            case 9:
                return Float.valueOf(((Number) h1Var.getValue()).floatValue());
            case 10:
                float f = 180;
                return Float.valueOf((ml.k.e(((Number) h1Var.getValue()).floatValue(), 0.0f, 1.0f) * f) + f);
            case 11:
                return Integer.valueOf(((List) h1Var.getValue()).size());
            case 12:
                v vVar = new v(((List) h1Var.getValue()).size(), 0);
                boolean z2 = C2978a.a;
                C2978a.b("KimiLog", null, new Ig.g(10, vVar));
                return vVar;
            default:
                List list2 = (List) h1Var.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (Intrinsics.b(((y4.l) obj2).b.a, "composable")) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
        }
    }
}
