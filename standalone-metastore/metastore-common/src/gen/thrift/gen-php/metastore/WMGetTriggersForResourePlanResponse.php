<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class WMGetTriggersForResourePlanResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'triggers',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WMTrigger',
                ),
        ),
    );

    /**
     * @var \metastore\WMTrigger[]
     */
    public $triggers = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['triggers'])) {
                $this->triggers = $vals['triggers'];
            }
        }
    }

    public function getName()
    {
        return 'WMGetTriggersForResourePlanResponse';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->triggers = array();
                        $_size1047 = 0;
                        $_etype1050 = 0;
                        $xfer += $input->readListBegin($_etype1050, $_size1047);
                        for ($_i1051 = 0; $_i1051 < $_size1047; ++$_i1051) {
                            $elem1052 = null;
                            $elem1052 = new \metastore\WMTrigger();
                            $xfer += $elem1052->read($input);
                            $this->triggers []= $elem1052;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('WMGetTriggersForResourePlanResponse');
        if ($this->triggers !== null) {
            if (!is_array($this->triggers)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('triggers', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->triggers));
            foreach ($this->triggers as $iter1053) {
                $xfer += $iter1053->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
