package raig.org.application;



import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import raig.org.domain.model.Agenda;


import java.io.IOException;



public class ApplicationTest {

  @Test
  public void whenUserwritesA1getOptionshouldreturn1() throws IOException {

    SystemIo systemIo = Mockito.mock(SystemIo.class);
    Agenda agenda = Mockito.mock(Agenda.class);
    Application application = new Application(systemIo,agenda);

    when(systemIo.getUserIoOption()).thenReturn(1);
    application.getUserOption();

    Assert.assertEquals(1,application.getOption());

  }

  @Test
  public void wheUserWritesA1shouldCallagendaAdd() {
    SystemIo systemIo = Mockito.mock(SystemIo.class);
    Agenda agenda = Mockito.mock(Agenda.class);
    Application application = new Application(systemIo,agenda);

    application.setOption(Application.option_add);

    application.executeOption();
    verify(agenda,times(1)).add(any());
  }

  @Test
  public void wheUserWritesA1shouldCallagendaList() {
    SystemIo systemIo = Mockito.mock(SystemIo.class);
    Agenda agenda = Mockito.mock(Agenda.class);
    Application application = new Application(systemIo,agenda);

    application.setOption(Application.option_list);

    application.executeOption();
    verify(agenda,times(1)).list();
  }
}
