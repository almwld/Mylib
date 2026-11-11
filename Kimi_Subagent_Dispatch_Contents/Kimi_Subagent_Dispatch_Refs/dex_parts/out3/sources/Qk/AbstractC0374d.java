package Qk;

import Sk.C0435m;
import Zn.C0513f;
import Zn.EnumC0512e;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import kotlin.collections.C1098w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qk.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public abstract class AbstractC0374d {
    public static final Sk.w A;
    public static final Sk.w B;
    public static final Sk.w C;
    public static final Sk.w D;
    public static final Sk.w E;
    public static final Sk.w F;
    public static final Sk.w G;
    public static final Sk.w H;
    public static final Sk.w I;
    public static final Sk.w J;
    public static final Sk.w K;
    public static final Sk.w L;
    public static final Sk.w M;
    public static final Sk.w N;
    public static final Sk.w O;
    public static final Sk.w P;
    public static final Sk.w Q;
    public static final Sk.w R;
    public static final Sk.w S;
    public static final Sk.w T;
    public static final Sk.w U;
    public static final Sk.w V;
    public static final Sk.w W;
    public static final Sk.w X;
    public static final Sk.w Y;
    public static final Sk.w Z;
    public static final Sk.w a0;
    public static final Sk.w b0;
    public static final Sk.w c0;
    public static final Sk.w d;
    public static final Sk.w d0;
    public static final Sk.w e;
    public static final Sk.w e0;
    public static final Sk.w f;
    public static final Sk.w f0;
    public static final Sk.w g;
    public static final Sk.w g0;
    public static final Sk.w h;
    public static final Sk.w h0;
    public static final Sk.w i;
    public static final Sk.w i0;
    public static final Sk.w j;
    public static final Sk.w j0;
    public static final Sk.w k;
    public static final Sk.w k0;
    public static final Sk.w l;
    public static final Sk.w l0;
    public static final Sk.w m;
    public static final Sk.w n;
    public static final Sk.w o;
    public static final Sk.w p;
    public static final Sk.w q;
    public static final Sk.w r;
    public static final Sk.w s;
    public static final Sk.w t;
    public static final Sk.w u;
    public static final Sk.w v;
    public static final Sk.w w;
    public static final Sk.w x;
    public static final Sk.w y;
    public static final Sk.w z;
    public static final Sk.w a = C0435m.b(new Pi.D0(12));
    public static final Sk.w b = C0435m.b(new Pi.D0(14));
    public static final Sk.w c = C0435m.b(new Pi.D0(26));

    static {
        final int i2 = 8;
        d = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i3 = 20;
        e = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i4 = 2;
        f = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i5 = 14;
        g = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i6 = 26;
        h = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        C0435m.b(new C0372c(8));
        i = C0435m.b(new C0372c(20));
        j = C0435m.b(new Pi.D0(23));
        final int i7 = 4;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i8 = 15;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i9 = 26;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i10 = 7;
        C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i11 = 18;
        C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i12 = 29;
        C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        C0435m.b(new C0372c(10));
        C0435m.b(new C0372c(21));
        C0435m.b(new Pi.D0(13));
        C0435m.b(new Pi.D0(15));
        C0435m.b(new Pi.D0(16));
        C0435m.b(new Pi.D0(17));
        C0435m.b(new Pi.D0(18));
        C0435m.b(new Pi.D0(19));
        C0435m.b(new Pi.D0(20));
        C0435m.b(new Pi.D0(21));
        C0435m.b(new Pi.D0(22));
        C0435m.b(new Pi.D0(24));
        C0435m.b(new Pi.D0(25));
        C0435m.b(new Pi.D0(27));
        C0435m.b(new Pi.D0(28));
        k = C0435m.b(new Pi.D0(29));
        final int i13 = 0;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i14 = 1;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i15 = 2;
        l = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i16 = 3;
        m = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i17 = 5;
        n = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i18 = 6;
        o = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i19 = 7;
        p = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i20 = 9;
        q = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i21 = 10;
        r = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i22 = 11;
        s = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i23 = 12;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i24 = 13;
        t = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i25 = 14;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i26 = 16;
        u = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i27 = 17;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i28 = 18;
        v = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i29 = 19;
        w = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i30 = 21;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i31 = 22;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i31) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i32 = 23;
        x = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i33 = 24;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i34 = 25;
        y = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i35 = 27;
        z = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i36 = 28;
        C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i37 = 29;
        A = C0435m.b(new Function0() { // from class: Qk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i37) {
                    case 0:
                        return new C0513f("drawable:artifact", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/artifact.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:at", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/at.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ban", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ban.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:baseline_bug_report_24", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/baseline_bug_report_24.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:anim_tool_ask_user", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_ask_user.webp", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:bg_artifact_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading.png", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:bg_artifact_loading2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2.png", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:bg_artifact_loading2_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading2_dark.png", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:addconversation", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/addconversation.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:bg_artifact_loading_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_artifact_loading_dark.png", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:bg_image_loading", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.h), "composeResources/kimi.shared.generated.resources/drawable-xxxhdpi/bg_image_loading.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:bg_slides_template_select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/bg_slides_template_select.png", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:bold", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bold.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:both_arrow_vertical", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/both_arrow_vertical.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:bottom", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/bottom.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:anim_tool_browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_browser.webp", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/box.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:browse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browse.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:browser", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:browser_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/browser_b.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:ai_brand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand.png", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:brush", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/brush.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:business", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/business.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:businesscard", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/businesscard.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:button_like", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_like.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:button_send_cancel", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_cancel.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:anim_tool_code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_code.webp", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:button_send_enable", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/button_send_enable.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:call_animated_box", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/call_animated_box.apng", -1L, -1L)));
                    default:
                        return new C0513f("drawable:camera", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/camera.xml", -1L, -1L)));
                }
            }
        });
        final int i38 = 0;
        B = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i38) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i39 = 1;
        C = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i39) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i40 = 3;
        D = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i40) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i41 = 4;
        E = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i41) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i42 = 5;
        F = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i42) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i43 = 6;
        G = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i44 = 8;
        H = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i45 = 9;
        I = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i45) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i46 = 10;
        J = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i46) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i47 = 11;
        K = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i47) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i48 = 12;
        C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i48) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i49 = 13;
        C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i49) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i50 = 15;
        L = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i50) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i51 = 16;
        M = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i51) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i52 = 17;
        N = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i52) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i53 = 19;
        O = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i53) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i54 = 20;
        C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i54) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i55 = 21;
        P = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i55) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i56 = 22;
        Q = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i56) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i57 = 23;
        C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i57) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i58 = 24;
        R = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i58) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i59 = 25;
        S = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i60 = 27;
        T = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i60) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        final int i61 = 28;
        U = C0435m.b(new Function0() { // from class: Qk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i61) {
                    case 0:
                        Zn.C[] elements = {new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/case_cny_bg.png", -1L, -1L), new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/case_cny_bg.png", -1L, -1L)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new C0513f("drawable:case_cny_bg", C1098w.b0(elements));
                    case 1:
                        return new C0513f("drawable:catalog", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/catalog.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:ai_brand_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_brand_dark.png", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:change", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:change_case", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/change_case.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:check_b_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_b_f.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:anim_tool_create_subagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_create_subagent.webp", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:check_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/check_f.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:checkbox", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkbox.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:checkboxempty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/checkboxempty.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:circle", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circle.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:circleplus", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/circleplus.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:clear", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clear.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:ai_logo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/ai_logo.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:clip", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clip.xml", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/clock.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:close", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close.xml", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:anim_tool_data", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_data.webp", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:close_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_f.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:close_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/close_new.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:closeiconin_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/closeiconin_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:code", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/code.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:collapse", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collapse.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:collect", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:collect_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/collect_f.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:allselected", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/allselected.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:comment", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:comment_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/comment_add.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:anim_tool_file", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/anim_tool_file.webp", -1L, -1L)));
                }
            }
        });
        V = C0435m.b(new C0372c(0));
        W = C0435m.b(new C0372c(1));
        X = C0435m.b(new C0372c(2));
        Y = C0435m.b(new C0372c(3));
        Z = C0435m.b(new C0372c(4));
        a0 = C0435m.b(new C0372c(5));
        b0 = C0435m.b(new C0372c(6));
        c0 = C0435m.b(new C0372c(7));
        d0 = C0435m.b(new C0372c(9));
        e0 = C0435m.b(new C0372c(11));
        f0 = C0435m.b(new C0372c(12));
        g0 = C0435m.b(new C0372c(13));
        C0435m.b(new C0372c(14));
        h0 = C0435m.b(new C0372c(15));
        i0 = C0435m.b(new C0372c(16));
        j0 = C0435m.b(new C0372c(17));
        k0 = C0435m.b(new C0372c(18));
        l0 = C0435m.b(new C0372c(19));
    }

    public static final C0513f a() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) b.getValue();
    }

    public static final C0513f b() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) d.getValue();
    }

    public static final C0513f c() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) g.getValue();
    }

    public static final C0513f d() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) F.getValue();
    }

    public static final C0513f e() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) H.getValue();
    }

    public static final C0513f f() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) J.getValue();
    }

    public static final C0513f g() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) M.getValue();
    }

    public static final C0513f h() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) N.getValue();
    }

    public static final C0513f i() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) O.getValue();
    }

    public static final C0513f j() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) T.getValue();
    }

    public static final C0513f k() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) W.getValue();
    }

    public static final C0513f l() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) g0.getValue();
    }

    public static final C0513f m() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) j0.getValue();
    }
}
