/**
 * This is the source code of Cherrygram for Android.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 * Please, be respectful and credit the original author if you use this code.
 *
 * Copyright github.com/arsLan4k1390, 2022-2025.
 */

package uz.unnarsx.cherrygram.core.icons.icon_replaces

import org.telegram.messenger.R
import uz.unnarsx.cherrygram.core.icons.newHashMap

class VkIconReplace : BaseIconReplace() {
    override val replaces: HashMap<Int, Int> = newHashMap(
            // Settings - Main
            R.drawable.msg_settings to R.drawable.settings_outline_28,
            R.drawable.msg_settings_old to R.drawable.settings_outline_28,
            R.drawable.msg_language to R.drawable.globe_outline_28,
            R.drawable.msg2_language to R.drawable.globe_outline_28,
            R.drawable.msg_secret to R.drawable.lock_outline_28,
            R.drawable.msg2_secret to R.drawable.lock_outline_28,
            R.drawable.msg2_data to R.drawable.services_outline_28,
            R.drawable.msg_msgbubble3 to R.drawable.messages_outline_28,
            R.drawable.msg2_discussion to R.drawable.messages_outline_28,
            R.drawable.msg2_folder to R.drawable.folder_outline_28,
            R.drawable.msg_folders to R.drawable.folder_outline_28,
            R.drawable.msg_help to R.drawable.help_outline_28,
            R.drawable.msg_policy to R.drawable.check_shield_outline_28,
            R.drawable.msg2_policy to R.drawable.check_shield_outline_28,
            R.drawable.msg_notifications to R.drawable.notifications_28,
            R.drawable.msg2_notifications to R.drawable.notifications_28,
            R.drawable.msg2_devices to R.drawable.laptop_outline_28,
            R.drawable.menu_devices to R.drawable.laptop_outline_28,
            R.drawable.msg2_ask_question to R.drawable.messages_outline_28,
            // Power Saving
//            R.drawable.msg2_sticker to R.drawable.msg_sticker_solar,
//            R.drawable.msg2_smile_status to R.drawable.input_smile_solar,
            R.drawable.msg2_call_earpiece to R.drawable.phone_wave_outline_28,
            R.drawable.msg2_videocall to R.drawable.videocam_outline_28,
            // Settings - CG
            R.drawable.camera_solar to R.drawable.camera_outline_28,
            R.drawable.msg_theme to R.drawable.palette_outline_28,
            R.drawable.msg_log to R.drawable.grid_square_outline_28,
            R.drawable.msg_send to R.mipmap.outline_send,
            R.drawable.msg_list to R.drawable.list_outline_28,
            R.drawable.bug_solar to R.drawable.bug_outline_28,
            R.drawable.heart_angle_solar to R.drawable.like_outline_28,
            // Messages
            R.drawable.input_bot2 to R.drawable.keyboard_bots_outline_28,
            R.drawable.input_notify_off to R.drawable.notification_disable_outline_28,
            R.drawable.input_notify_on to R.drawable.notifications_28,
            R.drawable.input_attach to R.drawable.attach_outline_28,
            R.drawable.input_mic to R.drawable.voice_outline_28,
            R.drawable.input_video to R.drawable.story_outline_28,
            R.drawable.input_schedule to R.drawable.calendar_outline_28,
            R.drawable.input_keyboard to R.drawable.keyboard_outline_28,
            R.drawable.input_bot1 to R.drawable.chevron_right_circle_outline_28,
            /*R.drawable.input_smile to R.drawable.smile_outline_28,
            R.drawable.input_sticker to R.drawable.sticker_outline_28,
            R.drawable.input_gif to R.drawable.picture_outline_28,*/
            R.drawable.attach_send to R.mipmap.outline_send,
            R.drawable.ic_send to R.mipmap.outline_send,
            // Drawer
            R.drawable.msg_archive to R.drawable.archive_outline_28,
            R.drawable.msg_contacts to R.drawable.user_outline_28,
            R.drawable.msg_calls to R.drawable.phone_outline_28,
            R.drawable.ic_call to R.drawable.phone_outline_24,
            R.drawable.msg_callback to R.drawable.phone_outline_28,
            R.drawable.profile_video to R.drawable.videocam_outline_28,
            R.drawable.msg_videocall to R.drawable.videocam_outline_28,
            R.drawable.msg_groups to R.drawable.users_outline_28,
            R.drawable.msg_channel to R.drawable.advertising_outline_28,
            R.drawable.msg_qrcode to R.drawable.qr_code_outline_28,
            // Context menu
            R.drawable.menu_reply to R.drawable.reply_outline_28,
            R.drawable.msg_link to R.drawable.chain_outline_28,
            R.drawable.msg_viewreplies to R.drawable.message_reply_outline_28,
            R.drawable.msg_recent to R.drawable.recent_outline_28,
            R.drawable.msg_pin to R.drawable.pin_outline_28,
            R.drawable.msg_unpin to R.drawable.unpin_outline_28,
            R.drawable.msg_gallery to R.drawable.picture_outline_28,
            R.drawable.msg_edit to R.drawable.edit_outline_28,
            R.drawable.msg_delete to R.drawable.delete_outline_android_28,
            R.drawable.msg_forward to R.drawable.share_outline_28,
            R.drawable.filled_fire to R.drawable.fire_outline_28,
            /*R.drawable.msg_gif to R.drawable.airplay_video_outline_28,*/
            R.drawable.msg_report to R.drawable.report_outline_28,
            R.drawable.msg_copy to R.drawable.copy_outline_28,
            R.drawable.msg_fave to R.drawable.favorite_outline_28,
            R.drawable.msg_shareout to R.drawable.share_external_outline_28,
            R.drawable.msg_download to R.drawable.download_outline_28,
            R.drawable.msg_saved to R.drawable.bookmark_outline_28,
            R.drawable.msg_clear to R.drawable.clear_data_outline_28,
            R.drawable.msg_stats to R.drawable.statistics_outline_28,
            R.drawable.msg_translate to R.drawable.hieroglyph_character_outline_28,
            // Action Bar
            R.drawable.ic_ab_other to R.drawable.more_vertical_28,
            R.drawable.group_edit to R.drawable.msg_edit,
            R.drawable.group_edit_profile to R.drawable.msg_edit,
            R.drawable.msg_search to R.drawable.search_outline_28,
            R.drawable.msg_block to R.drawable.block_outline_28,
            R.drawable.msg_info to R.drawable.info_outline_28,
            R.drawable.msg_share to R.drawable.share_outline_28,
            R.drawable.msg_home to R.drawable.home_outline_28,
            R.drawable.ic_upward to R.drawable.arrow_up_outline_28,
            R.drawable.msg_discussion to R.drawable.messages_outline_28,
            R.drawable.msg_leave to R.drawable.door_arrow_right_outline_28,
            R.drawable.msg_addphoto to R.drawable.story_add_outline_28,
            R.drawable.msg_unmute to R.drawable.volume_outline_28,
            R.drawable.msg_mute to R.drawable.mute_outline_28,
            R.drawable.msg_customize to R.drawable.sliders_outline_28,
            R.drawable.msg_topics to R.drawable.list_outline_28,
            R.drawable.msg_addcontact to R.drawable.user_add_outline_28,
            R.drawable.msg_topic_create to R.drawable.message_add_badge_outline_28,
            R.drawable.msg_topic_close to R.drawable.remove_circle_outline_28,
            // Admin panel
            R.drawable.msg_permissions to R.drawable.key_outline_28,
            R.drawable.msg_reactions to R.drawable.like_outline_28,
            R.drawable.msg_reactions2 to R.drawable.like_outline_28,
            R.drawable.msg_retry to R.drawable.switch_outline_28,
            R.drawable.msg_link2 to R.drawable.chain_outline_28,
            R.drawable.msg_admins to R.drawable.user_star_badge_outline_28,
            R.drawable.msg_admin_add to R.drawable.user_star_badge_outline_28,
            R.drawable.msg_discuss to R.drawable.chats_outline_28,
            //R.drawable.ic_ab_search to R.drawable.search_outline_28,
            R.drawable.msg_contact_add to R.drawable.user_add_outline_28,
            R.drawable.msg_clearcache to R.drawable.delete_outline_28,
            R.drawable.msg_newphone to R.drawable.cards_2_outline_28,
            R.drawable.msg_message to R.drawable.view_outline_28,
            R.drawable.msg_select_between_solar to R.drawable.list_check_outline_28,
            R.drawable.msg_viewchats to R.drawable.chats_outline_28,
            R.drawable.msg_sendfile to R.drawable.document_outline_28,
            R.drawable.msg_mini_qr to R.drawable.qr_code_outline_28, // active sessions QR
            R.drawable.msg_qr_mini to R.drawable.qr_code_outline_28, // ProfileActivity QR

            R.drawable.msg_calls_regular to R.drawable.phone_wave_outline_28,
            R.drawable.msg_view_file to R.drawable.view_outline_28, // Cache settings
            R. drawable.chats_saved to R.drawable.bookmark_outline_28, // Saved messages
            R.drawable.profile_newmsg to R.drawable.comment_outline_28,

    )

}
