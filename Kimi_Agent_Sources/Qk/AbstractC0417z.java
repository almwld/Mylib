package Qk;

import Sk.C0435m;
import Zn.C0513f;
import Zn.EnumC0512e;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qk.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public abstract class AbstractC0417z {
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
    public static final Sk.w c;
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
    public static final Sk.w m0;
    public static final Sk.w n;
    public static final Sk.w n0;
    public static final Sk.w o;
    public static final Sk.w o0;
    public static final Sk.w p;
    public static final Sk.w p0;
    public static final Sk.w q;
    public static final Sk.w q0;
    public static final Sk.w r;
    public static final Sk.w r0;
    public static final Sk.w s;
    public static final Sk.w s0;
    public static final Sk.w t;
    public static final Sk.w t0;
    public static final Sk.w u;
    public static final Sk.w u0;
    public static final Sk.w v;
    public static final Sk.w w;
    public static final Sk.w x;
    public static final Sk.w y;
    public static final Sk.w z;
    public static final Sk.w a = C0435m.b(new C0407u(2));
    public static final Sk.w b = C0435m.b(new C0407u(4));

    static {
        C0435m.b(new C0407u(16));
        c = C0435m.b(new C0407u(28));
        final int i2 = 10;
        d = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i3 = 22;
        e = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i4 = 4;
        f = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i5 = 16;
        g = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i6 = 28;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        C0435m.b(new C0415y(10));
        h = C0435m.b(new C0407u(13));
        i = C0435m.b(new C0407u(24));
        final int i7 = 5;
        j = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i8 = 16;
        k = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i9 = 27;
        l = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i10 = 8;
        m = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i11 = 19;
        n = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        o = C0435m.b(new C0415y(0));
        p = C0435m.b(new C0415y(11));
        q = C0435m.b(new C0407u(3));
        C0435m.b(new C0407u(5));
        C0435m.b(new C0407u(6));
        C0435m.b(new C0407u(7));
        r = C0435m.b(new C0407u(8));
        C0435m.b(new C0407u(9));
        s = C0435m.b(new C0407u(10));
        t = C0435m.b(new C0407u(11));
        u = C0435m.b(new C0407u(12));
        v = C0435m.b(new C0407u(14));
        w = C0435m.b(new C0407u(15));
        x = C0435m.b(new C0407u(17));
        y = C0435m.b(new C0407u(18));
        z = C0435m.b(new C0407u(19));
        A = C0435m.b(new C0407u(20));
        B = C0435m.b(new C0407u(21));
        C0435m.b(new C0407u(22));
        C = C0435m.b(new C0407u(23));
        D = C0435m.b(new C0407u(25));
        E = C0435m.b(new C0407u(26));
        F = C0435m.b(new C0407u(27));
        C0435m.b(new C0407u(29));
        final int i12 = 0;
        G = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i13 = 1;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i14 = 2;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i15 = 3;
        H = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i16 = 4;
        I = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i17 = 6;
        J = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i18 = 7;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i19 = 8;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i20 = 9;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i21 = 11;
        K = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i22 = 12;
        L = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i23 = 13;
        M = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i24 = 14;
        N = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i25 = 15;
        O = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i26 = 17;
        P = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i27 = 18;
        Q = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i28 = 19;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i29 = 20;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i30 = 21;
        R = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i31 = 23;
        S = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i31) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i32 = 24;
        T = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i33 = 25;
        C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i34 = 26;
        U = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i35 = 28;
        V = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i36 = 29;
        W = C0435m.b(new Function0() { // from class: Qk.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        return new C0513f("drawable:search", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/search.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:select", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/select.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:send", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:send_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:send_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/send_f_new.xml", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:project_library_files_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:setting", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/setting.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:shape", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:shape_oneclick_bg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shape_oneclick_bg.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:share", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:project_icon_tutorial_guide", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_tutorial_guide.png", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:share_a", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_a.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:share_gift", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/share_gift.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:shengzi_svg", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/shengzi_svg.xml", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:skill", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/skill.xml", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:skill_manager_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_library_files_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_files_placeholder_dark.xml", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:skill_manager_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/skill_manager_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:sounds", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/sounds.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:splashscreen", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/splashscreen.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:stop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:stop_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:project_icon_two_hearts", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_two_hearts.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:stop_f_new", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stop_f_new.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:stroke", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/stroke.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:style", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/style.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:switch_1", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/switch_1.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:project_library_instruction_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:tabdiscover", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover.xml", -1L, -1L)));
                    default:
                        return new C0513f("drawable:tabdiscover_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabdiscover_f.xml", -1L, -1L)));
                }
            }
        });
        final int i37 = 0;
        X = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i37) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i38 = 1;
        Y = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i38) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i39 = 2;
        Z = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i39) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i40 = 3;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i40) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i41 = 5;
        a0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i41) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i42 = 6;
        b0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i42) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i43 = 7;
        c0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i44 = 9;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i45 = 10;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i45) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i46 = 11;
        d0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i46) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i47 = 12;
        e0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i47) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i48 = 13;
        f0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i48) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i49 = 14;
        g0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i49) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i50 = 15;
        h0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i50) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i51 = 17;
        i0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i51) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i52 = 18;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i52) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i53 = 20;
        j0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i53) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i54 = 21;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i54) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i55 = 22;
        k0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i55) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i56 = 23;
        l0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i56) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i57 = 24;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i57) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i58 = 25;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i58) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i59 = 26;
        m0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i60 = 27;
        C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i60) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        final int i61 = 29;
        n0 = C0435m.b(new Function0() { // from class: Qk.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i61) {
                    case 0:
                        return new C0513f("drawable:tabkimi", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi.xml", -1L, -1L)));
                    case 1:
                        return new C0513f("drawable:tabkimi_f", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tabkimi_f.xml", -1L, -1L)));
                    case 2:
                        return new C0513f("drawable:tag", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tag.xml", -1L, -1L)));
                    case 3:
                        return new C0513f("drawable:task_alarm", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_alarm.xml", -1L, -1L)));
                    case 4:
                        return new C0513f("drawable:project_icon_verified_check", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_verified_check.png", -1L, -1L)));
                    case 5:
                        return new C0513f("drawable:task_clock", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_clock.xml", -1L, -1L)));
                    case 6:
                        return new C0513f("drawable:task_detail_icon", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon.xml", -1L, -1L)));
                    case 7:
                        return new C0513f("drawable:task_detail_icon_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_detail_icon_dark.xml", -1L, -1L)));
                    case 8:
                        return new C0513f("drawable:project_library_instruction_placeholder_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_instruction_placeholder_dark.xml", -1L, -1L)));
                    case 9:
                        return new C0513f("drawable:task_empty", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/task_empty.xml", -1L, -1L)));
                    case 10:
                        return new C0513f("drawable:taskbar_project_folder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder.xml", -1L, -1L)));
                    case 11:
                        return new C0513f("drawable:taskbar_project_folder_add", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/taskbar_project_folder_add.xml", -1L, -1L)));
                    case 12:
                        return new C0513f("drawable:tasksubagent", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tasksubagent.xml", -1L, -1L)));
                    case 13:
                        return new C0513f("drawable:template_to_skill_avatar_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_dark.png", -1L, -1L)));
                    case 14:
                        return new C0513f("drawable:template_to_skill_avatar_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_avatar_light.png", -1L, -1L)));
                    case 15:
                        return new C0513f("drawable:template_to_skill_dark", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_dark.jpg", -1L, -1L)));
                    case 16:
                        return new C0513f("drawable:project_icon_waving_hand", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_waving_hand.png", -1L, -1L)));
                    case 17:
                        return new C0513f("drawable:template_to_skill_light", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.g), "composeResources/kimi.shared.generated.resources/drawable-xxhdpi/template_to_skill_light.jpg", -1L, -1L)));
                    case 18:
                        return new C0513f("drawable:text", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/text.xml", -1L, -1L)));
                    case 19:
                        return new C0513f("drawable:project_library_memory_placeholder", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_library_memory_placeholder.xml", -1L, -1L)));
                    case 20:
                        return new C0513f("drawable:translate", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/translate.xml", -1L, -1L)));
                    case 21:
                        return new C0513f("drawable:trash01", kotlin.collections.Y.b(new Zn.C(kotlin.collections.Y.b(EnumC0512e.f), "composeResources/kimi.shared.generated.resources/drawable-xhdpi/trash01.png", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PAY_INSURANCE /* 22 */:
                        return new C0513f("drawable:tts_pause_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_pause_v2.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_SUBSCRIBE_MINI_PROGRAM_MSG /* 23 */:
                        return new C0513f("drawable:tts_play_v2", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/tts_play_v2.xml", -1L, -1L)));
                    case 24:
                        return new C0513f("drawable:underline", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/underline.xml", -1L, -1L)));
                    case 25:
                        return new C0513f("drawable:undo", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/undo.xml", -1L, -1L)));
                    case 26:
                        return new C0513f("drawable:unpinfromtop", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/unpinfromtop.xml", -1L, -1L)));
                    case 27:
                        return new C0513f("drawable:up", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up.xml", -1L, -1L)));
                    case ConstantsAPI.COMMAND_PRELOAD_MINI_PROGRAM /* 28 */:
                        return new C0513f("drawable:project_icon_work", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/project_icon_work.png", -1L, -1L)));
                    default:
                        return new C0513f("drawable:up_b", kotlin.collections.Y.b(new Zn.C(kotlin.collections.K.a, "composeResources/kimi.shared.generated.resources/drawable/up_b.xml", -1L, -1L)));
                }
            }
        });
        C0435m.b(new C0415y(1));
        o0 = C0435m.b(new C0415y(2));
        p0 = C0435m.b(new C0415y(3));
        q0 = C0435m.b(new C0415y(4));
        r0 = C0435m.b(new C0415y(5));
        s0 = C0435m.b(new C0415y(6));
        t0 = C0435m.b(new C0415y(7));
        u0 = C0435m.b(new C0415y(8));
        C0435m.b(new C0415y(9));
    }

    public static final C0513f a() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) z.getValue();
    }

    public static final C0513f b() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) A.getValue();
    }

    public static final C0513f c() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) G.getValue();
    }

    public static final C0513f d() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) H.getValue();
    }

    public static final C0513f e() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) K.getValue();
    }

    public static final C0513f f() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) N.getValue();
    }

    public static final C0513f g() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) d0.getValue();
    }

    public static final C0513f h() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) m0.getValue();
    }

    public static final C0513f i() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) s0.getValue();
    }

    public static final C0513f j() {
        Intrinsics.checkNotNullParameter(F.a, "<this>");
        return (C0513f) t0.getValue();
    }
}
