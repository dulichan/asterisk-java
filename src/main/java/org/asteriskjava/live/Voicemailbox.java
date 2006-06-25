package org.asteriskjava.live;

import java.io.Serializable;

/**
 * An Asterisk voicemailbox with status.
 * 
 * @author srt
 * @version $Id$
 * @since 0.3
 */
public class Voicemailbox implements Serializable
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 2750652515961182547L;
    private final String mailbox;
    private final String context;
    private final String user;
    private int newMessages;
    private int oldMessages;

    /**
     * Creates a new instance.
     * 
     * @param mailbox the name of this mailbox as defined in
     *            <code>voicemail.conf</code>.
     * @param context the context of this mailbox as defined in
     *            <code>voicemail.conf</code>.
     * @param user the user of this mailbox as defined in
     *            <code>voicemail.conf</code>.
     */
    public Voicemailbox(String mailbox, String context, String user)
    {
        this.mailbox = mailbox;
        this.context = context;
        this.user = user;
    }

    /**
     * Returns the name of this mailbox as defined in
     * <code>voicemail.conf</code>.
     * 
     * @return the name of this mailbox as defined in
     *         <code>voicemail.conf</code>.
     */
    public String getMailbox()
    {
        return mailbox;
    }

    /**
     * Returns the context of this mailbox as defined in
     * <code>voicemail.conf</code>.
     * 
     * @return the context of this mailbox as defined in
     *         <code>voicemail.conf</code>.
     */
    public String getContext()
    {
        return context;
    }

    /**
     * Returns the user (usually the full name) of this mailbox as defined in
     * <code>voicemail.conf</code>.
     * 
     * @return the user of this mailbox as defined in
     *         <code>voicemail.conf</code>.
     */
    public String getUser()
    {
        return user;
    }

    /**
     * Returns the number of new messages.
     * 
     * @return the number of new messages.
     */
    public int getNewMessages()
    {
        return newMessages;
    }

    /**
     * Sets the number of new messages.
     * 
     * @param newMessages the number of new messages.
     */
    public void setNewMessages(int newMessages)
    {
        this.newMessages = newMessages;
    }

    /**
     * Returns the number of old messages.
     * 
     * @return the number of old messages.
     */
    public int getOldMessages()
    {
        return oldMessages;
    }

    /**
     * Sets the number of old messages.
     * 
     * @param oldMessages the number of old messages.
     */
    public void setOldMessages(int oldMessages)
    {
        this.oldMessages = oldMessages;
    }

    public String toString()
    {
        StringBuffer sb;

        sb = new StringBuffer("Voicemailbox[");
        sb.append("mailbox='" + getMailbox() + "',");
        sb.append("context='" + getContext() + "',");
        sb.append("user='" + getUser() + "',");
        sb.append("newMessages=" + getNewMessages() + ",");
        sb.append("oldMessages=" + getOldMessages() + "]");

        return sb.toString();
    }
}
